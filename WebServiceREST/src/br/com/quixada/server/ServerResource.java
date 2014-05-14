package br.com.quixada.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.quixada.dao.UsuarioDAO;
import br.com.quixada.dao.impl.UsuarioJPADAO;
import br.com.quixada.model.Usuario;
import br.com.quixada.util.JPAUtil;

@Path("/server")
public class ServerResource {
	private UsuarioDAO usd = new UsuarioJPADAO();
	Gson gson = new Gson();

	@GET
	@Path("/buscarTodosUsuarios")
	@Produces("application/json")
	public String selTodosGSON() {
		// @PathParam("name") String name
		return gson.toJson(usd.find());
	}

	@GET
	@Path("/getUsuario/{email}")
	@Produces("application/json")
	public String getUsuario(@PathParam("email") String email) {
		return gson.toJson((Usuario) JPAUtil.getEntityManager().createQuery("from Usuario where email = :email").setParameter("email", email).getSingleResult());
	}

	@GET
	@Path("/delete/{email}")
	@Produces("application/json")
	public String deleteUsuario(@PathParam("email") String email) {
		Usuario user2 = (Usuario) JPAUtil.getEntityManager().createQuery("from Usuario where email = :email").setParameter("email", email).getSingleResult();
		usd.beginTransaction();
		System.out.println(user2.toString());
		usd.delete(user2);
		usd.commit();
		usd.close();
		return "Deletado com sucesso";
	}

	@GET
    @Path("inserir/{name}/{email}/{senha}")
    @Produces("application/json")
    public String inserirUsuario(@PathParam("name") String name, @PathParam("email") String email, @PathParam("senha") String senha){
		System.out.println(name + "! !"+senha +"! !"+ email);
		usd.beginTransaction();
    	usd.save(new Usuario(name, email, senha));
    	usd.close();
    	return new Usuario(name, email, senha).toString();
    }
}

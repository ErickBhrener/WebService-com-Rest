package br.com.quixada.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.quixada.dao.UsuarioDAO;
import br.com.quixada.dao.impl.UsuarioJPADAO;
import br.com.quixada.model.Usuario;
import br.com.quixada.util.JPAUtil;
import com.sun.jersey.json.impl.provider.entity.JSONJAXBElementProvider;
import com.sun.jersey.json.impl.provider.entity.JSONRootElementProvider;
import com.sun.jersey.json.impl.provider.entity.JSONListElementProvider;
import com.google.gson.Gson;

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

	@POST
	@Path("/inserir")
    @Consumes("application/json")
    public Response inserirUsuario(Usuario usuario){
		System.out.println(usuario.getName() + "! !"+usuario.getEmail() +"! !"+ usuario.getSenha());
		usd.beginTransaction();
    	usd.save(usuario);
    	usd.close();
    	return Response.status(201).entity(usuario.getEmail()).build();
    }
}
//@PathParam("name") String name, @PathParam("email") String email, @PathParam("senha") String senha
//@Produces(MediaType.APPLICATION_JSON)
//@Path("inserir/{name}/{email}/{senha}")
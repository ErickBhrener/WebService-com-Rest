package br.com.quixada.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/server")
public class ServerResource {
    
//    @GET
//    @Path("/buscarTodos")
//    @Produces("application/json")
//    public ArrayList<Cliente> selTodos(){
//     return Banco.getBancoInstance().getListaClientes();
//    }

    @GET
    @Path("/buscarTudo")
    @Produces("application/json")
    public String selTodosGSON(){
    	//@PathParam("name") String name
     return "";
    }
    
//    @GET
//    @Path("/buscarDenuncias")
//    @Produces("application/json")
//    public String todasDenuncias(){
//    	return BancoDAO.getBancoInstance().getAllDenuncias();
//    }
    @GET
    @Path("/getUsuario/{name}")
    @Produces("application/json")
    public String getUsuario(@PathParam("name") String name){
    	return "";
    }
    
    @GET
    @Path("/delete/{name}")
    @Produces("application/json")
    public String deleteUsuario(@PathParam("name") String name){
     return "";
    }
    
    @GET
    @Path("inserir/{name}/{sexo}/{email}/{nasc}")
    @Produces("application/json")
    public String inserirUsuario(@PathParam("name") String name, @PathParam("sexo") String sexo,
    		@PathParam("email") String email, @PathParam("nasc") String nasc){
     return "";
    }
}

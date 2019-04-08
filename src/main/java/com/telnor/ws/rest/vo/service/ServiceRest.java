package com.telnor.ws.rest.vo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONException;
import com.google.gson.Gson;
import com.telnor.ws.rest.example.dao.GaritaDao;
import com.telnor.ws.rest.example.dao.UsuarioDao;
import com.telnor.ws.rest.vo.ObjetoGarita;
import com.telnor.ws.rest.vo.ObjetoUsuario;
import com.telnor.ws.rest.vo.Result;;

  /**@version 1.0
   * @author Abdiel
   * Metodo que consulta todos los elementos dela BD.
   */

  @Path("/asteriscoGarita") //Path general
  public class ServiceRest {
      private Statement stmt;
      private PreparedStatement pst;
      private ResultSet rs;
      private Connection con;
      private String sql;


      @POST
      @Path("/garita") //Path metodo
      @Consumes(MediaType.APPLICATION_JSON) //Consume
      @Produces(MediaType.APPLICATION_JSON) //Produce
      public List < ObjetoGarita > valida() throws JSONException {
          
    	  Result res = new Result();
          List < ObjetoGarita > lista = res.obtieneGarita();
          System.out.println("CONTADOR DEL WHILES$$$$$$$$$$$" + lista.size());
          
          return lista;

      }


      /**@version 1.0
       * @author Abdiel
       * Metodo que Inserta a la BD GARITA_INSERT.
       * @throws JSONException 
       */
    
      @POST
      @Path("/insertaGarita") //Path metodo
      @Consumes(MediaType.APPLICATION_JSON) //Consume
      @Produces(MediaType.APPLICATION_JSON) //Produce
      public boolean insertaGarita(String content) {

    	  Gson g = new Gson();
          ObjetoGarita garita = (ObjetoGarita) g.fromJson(content, ObjetoGarita.class);
          GaritaDao dao = new GaritaDao();
          
          return dao.insertarGarita(garita);
      }

      /**@version 1.0
       * @author Abdiel
       * Metodo que Inserta a la BD GARITA_USUARIO.
       * @throws JSONException 
       */
    
      @POST
      @Path("/insertaUsuario") //Path metodo
      @Consumes(MediaType.APPLICATION_JSON) //Consume
      @Produces(MediaType.APPLICATION_JSON) //Produce
      public boolean insertaUsuario(String content) {
          
    	  Gson g = new Gson();
          ObjetoUsuario usuario = (ObjetoUsuario) g.fromJson(content, ObjetoUsuario.class);
          UsuarioDao dao = new UsuarioDao();
          
          return dao.insertarUsuario(usuario);
      }


      /**@version 1.0
       * @author Abdiel
       * Consulta ultimos 3 registros en la BD.
       * @throws JSONException 
       */
      
      @POST
      @Path("/garitaUnica") //Path metodo
      @Consumes(MediaType.APPLICATION_JSON) //Consume
      @Produces(MediaType.APPLICATION_JSON) //Produce

      public List < ObjetoGarita > garitaConsulta(ObjetoGarita usuario) throws JSONException {
          
    	  Result res = new Result();
          List < ObjetoGarita > lista = res.garitaConsulta(usuario);
          System.out.println("CONTADOR DEL WHILES$$$$$$$$$$$" + lista.size());
          
          return lista;
      }


      /**@version 1.0
       * @author Abdiel
       * Valida Usuario de BD.
       * @throws JSONException
       * Login 
       */
     
      @POST
      @Path("/validausuario") //Path metodo
      @Consumes(MediaType.APPLICATION_JSON) //Consume
      @Produces(MediaType.APPLICATION_JSON) //Produce
      public ObjetoUsuario validaUsuarioResult(String usuario) {
          
    	  ObjetoUsuario objUsr = null;
          Gson g = new Gson();
          Result res = new Result();
          objUsr = (ObjetoUsuario) g.fromJson(usuario, ObjetoUsuario.class);
          System.out.println(objUsr);
          objUsr = res.validaUsuario(objUsr);
          System.out.println("Objeto Obtenido despues de la validacion / " + objUsr);

          return objUsr;

      }

  }
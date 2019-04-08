package com.telnor.ws.rest.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.telnor.ws.rest.controle.C;
import com.telnor.ws.rest.vo.ObjetoGarita;
import com.telnor.ws.rest.vo.ObjetoUsuario;

public class UsuarioDao {
	 private  Statement stmt;
	 private  PreparedStatement pst;
	 private  ResultSet rs;
	 private  Connection con;
	 private  String sql;
	public boolean insertarUsuario(ObjetoUsuario usuario) {
		
		 try {
			 sql  = "INSERT INTO GARITA_USUARIO (USUARIO,PASS,TIPO)VALUES(?,?,?)";
			 con = C.cb();
			 pst = con.prepareStatement(sql);
			 pst.setString(1, usuario.getUsuario());
			 pst.setString(2, usuario.getPass());
			 pst.setInt(3, usuario.getTipo());
			 pst.execute();
				
			 return true;

		 }catch(Exception e) {
			 e.printStackTrace();
			 return false;
		 }
		 
	 }
	

}

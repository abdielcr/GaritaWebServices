package com.telnor.ws.rest.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.telnor.ws.rest.controle.C;
import com.telnor.ws.rest.vo.ObjetoGarita;;;

public class Result {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url =  "jdbc:oracle:thin:@//10.205.49.30:1521/ORACLEDB";
	String user =  "EXPERIENCIATDA";
	String pass =  "experienciatda2018";
	private Statement stmt;
	private PreparedStatement pst;
	private ResultSet rs;
	private Connection con;
	private String sql;

	
	/**@version 1.0
	 * @author Abdiel
	 * Metodo que consulta todas las GARITAS
	 * 04/06/2019
	 * @category SQL Con sulta general Base de Datos Garita 
	 */	
	
	//Consulta para mandar a objeto Json
	public List<ObjetoGarita> obtieneGarita(){
		System.out.println("Las variasbles de conexion properties son"+driver+" "+url+" "+user+" "+pass);
		ObjetoGarita 	   objGarita 	  = null;
		List<ObjetoGarita> lista = new ArrayList<ObjetoGarita>();
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url,user,pass);
			Statement stmt = conexion.createStatement();
			ResultSet res = null;
			String qry = "SELECT * FROM GARITA_INSERT";
			res = stmt.executeQuery(qry);
			int total = 0;
			
			System.out.println("El total de registros es : "+total);
			while(res.next()) {
				System.out.println("Estoy entrando al query!!@####");
				objGarita = new ObjetoGarita();
				objGarita.setNumGarita         (res.getInt("NUMGARITA"));
				objGarita.setNameGarita        (res.getString("NAMEGARITA").trim());
				objGarita.setCarrilNormal      (res.getInt("CARRILNORMAL"));
				objGarita.setReadyLine         (res.getInt("READYLINE"));
				objGarita.setSentryLine        (res.getInt("SENTRILINE"));
				objGarita.setPeatonal          (res.getInt("PEATONAL"));
				objGarita.setDiaNum            (res.getInt("DIANUM"));
				objGarita.setDiaSemana         (res.getString("DIASEMANA").trim());
				objGarita.setHoraActualiza     (res.getInt("HORAACTUALIZA"));
				objGarita.setMinActualiza      (res.getInt("MINACTUALIZA"));
				objGarita.setFechaActualiza    (res.getString("FECHAACTUALIZA").trim());
				objGarita.setUsrActualiza      (res.getString("USRACTUALIZA").trim());
				objGarita.setDispositivoAndroid(res.getString("DISPOSITIVOANDROID").trim());
				objGarita.setPuertas           (res.getInt("PUERTASOPEN"));
				
				
				System.out.println("--------------------------------------#####"+objGarita.toString());
				
				lista.add(objGarita);
				total++;
			}
			System.out.println("Contador del WHILE####"+total);
		} catch(Exception e) {
			System.out.println("RestGarita [obtieneGarita] / Error al hacer la consulta / " + e);
		}
		return lista;
	}
	
	/**@version 1.0
	 * @author Abdiel
	 * Metodo que consulta por garita y obtiene las ultimas 3
	 * 04/06/2019
	 * @category SQL Con sulta general Base de Datos Garita 
	 */	
	
	public List<ObjetoGarita> garitaConsulta (ObjetoGarita objGta) {
	 	  ObjetoGarita 	   objGarita 	  = null;
	 	  List<ObjetoGarita> lista = new ArrayList<ObjetoGarita>();
	 	  try {
	 	   System.out.println("Entro al TRY DE OBTIENE GARITA **#*#-");
	 	   String qry = "SELECT * FROM GARITA_INSERT WHERE  NAMEGARITA= '" + objGta.getNameGarita()+ "'  ORDER BY IDGARITA DESC fetch first 3 rows with ties ";
	 	   con = C.cb();
	 	   stmt = con.createStatement();
	 	   rs = stmt.executeQuery(qry);
	 	   int total = 0;
	 	   System.out.println("El total de registros es : "+total);
	 	   
	 	   System.out.println("Consulta del objeto obtiene Garita " + qry.toString());
	 	   while(rs.next()) {
	 			System.out.println("Estoy entrando al query!!@####");
	 			objGarita = new ObjetoGarita();
	 			objGarita.setNumGarita         (rs.getInt("NUMGARITA"));
	 			objGarita.setNameGarita        (rs.getString("NAMEGARITA").trim());
	 			objGarita.setCarrilNormal      (rs.getInt("CARRILNORMAL"));
	 			objGarita.setReadyLine         (rs.getInt("READYLINE"));
	 			objGarita.setSentryLine        (rs.getInt("SENTRILINE"));
	 			objGarita.setPeatonal          (rs.getInt("PEATONAL"));
	 			objGarita.setDiaNum            (rs.getInt("DIANUM"));
	 			objGarita.setDiaSemana         (rs.getString("DIASEMANA").trim());
	 			objGarita.setHoraActualiza     (rs.getInt("HORAACTUALIZA"));
	 			objGarita.setMinActualiza      (rs.getInt("MINACTUALIZA"));
	 			objGarita.setFechaActualiza    (rs.getString("FECHAACTUALIZA").trim());
	 			objGarita.setUsrActualiza      (rs.getString("USRACTUALIZA").trim());
	 			objGarita.setDispositivoAndroid(rs.getString("DISPOSITIVOANDROID").trim());
	 			objGarita.setPuertas           (rs.getInt("PUERTASOPEN"));
	 			
	 			
	 			System.out.println("--------------------------------------#####"+objGarita.toString());
	 			
	 			lista.add(objGarita);
	 			total++;
	 		}

	 	  } catch (SQLException e) {
	 	   System.out.println("Error SQL es : " + e);
	 	  } catch (Exception e) {
	 	   // TODO: handle exception
	 	   System.out.println("Error EXCEPCION es : " + e);;
	 	  }
	 	  return lista;
	 	 }

	 public ObjetoUsuario validaUsuario(ObjetoUsuario objUsr) {

		  try {
		   System.out.println("Entro al TRY DE VALIDA USUARIO **#*#-");
		   String qry = "SELECT * FROM GARITA_USUARIO WHERE USUARIO = '" + objUsr.getUsuario() + "'" + " AND PASS = '" + objUsr.getPass() + "'";
		   con = C.cb();
		   stmt = con.createStatement();
		   rs = stmt.executeQuery(qry);
		   System.out.println("Consulta del objeto valida usuario " + qry.toString());
		   if (rs.next()) {
		    System.out.println("Estoy en el if");

		    objUsr.setUserValido(true);
		   } else {
		    System.out.println("Estoy en el else");
		    objUsr.setUserValido(false);
		   }

		  } catch (SQLException e) {
		   System.out.println("Error SQL es : " + e);
		  } catch (Exception e) {
		   // TODO: handle exception
		   System.out.println("Error EXCEPCION es : " + e);;
		  }
		  return objUsr;
		 }
		 
	
	
	
}

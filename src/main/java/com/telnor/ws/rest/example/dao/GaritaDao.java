package com.telnor.ws.rest.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.telnor.ws.rest.controle.C;
import com.telnor.ws.rest.vo.ObjetoGarita;


/**@version 1.0
 * @author Abdiel
 * Metodo que Inserta a la BD.
 * @category SQL Insersecion A Base de Datos Garita 
 */
public class GaritaDao {
	 private PreparedStatement pst;
	 private ResultSet rs;
	 private Connection con;
	 private String sql;
	public boolean insertarGarita(ObjetoGarita garita) {
		
		 try {
			 sql  = "INSERT INTO GARITA_INSERT (NUMGARITA,NAMEGARITA,CARRILNORMAL,READYLINE,SENTRILINE,PEATONAL,DIANUM,DIASEMANA,HORAACTUALIZA,MINACTUALIZA,FECHAACTUALIZA,USRACTUALIZA,DISPOSITIVOANDROID,PUERTASOPEN)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 con = C.cb();
			 pst = con.prepareStatement(sql);
			 pst.setInt(1, garita.getNumGarita());
			 pst.setString(2, garita.getNameGarita());
			 pst.setInt(3, garita.getCarrilNormal());
			 pst.setInt(4, garita.getReadyLine());
			 pst.setInt(5, garita.getSentryLine());
			 pst.setInt(6, garita.getPeatonal());
			 pst.setInt(7, garita.getDiaNum());
			 pst.setString(8, garita.getDiaSemana());
			 pst.setInt(9, garita.getHoraActualiza());
			 pst.setInt(10, garita.getMinActualiza());
			 pst.setString(11, garita.getFechaActualiza());
			 pst.setString(12, garita.getUsrActualiza());
			 pst.setString(13, garita.getDispositivoAndroid());
			 pst.setInt(14, garita.getPuertas());
			 pst.execute();
				
			 return true;

		 }catch(Exception e) {
			 e.printStackTrace();
			 return false;
		 }
		 
	 }
	
}

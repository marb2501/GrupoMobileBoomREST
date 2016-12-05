package com.mobileboom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mobileboom.bean.Publicacion;
import com.mobileboom.util.MySqlDBConn;

public class PublicacionDAO {
	
public List<Publicacion> buscaPublicaciones(Integer estado) throws Exception{
		
		List<Publicacion> publicaciones = new ArrayList<>();
		Publicacion publicacion = null;
		
		Connection cn = MySqlDBConn.obtenerConexion();
		try {
			
			String sql="select * from publicacion";
			
			PreparedStatement pst=cn.prepareStatement(sql);
			
			System.out.println(pst);
			
			ResultSet rs=pst.executeQuery();

			while(rs.next()){	
				publicacion = new Publicacion();
				publicacion.setId(rs.getInt(1));
				publicacion.setUsuario(rs.getString(2));
				publicacion.setContenido(rs.getString(3));
				publicacion.setUbicacion(rs.getString(5));
				publicacion.setCodigoTipoPublicacion(rs.getInt(6));
				publicacion.setEstado(rs.getInt(7));
				publicaciones.add(publicacion);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		cn.close();		
	
		return publicaciones;
	}	
}

package com.mobileboom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mobileboom.bean.Usuario;
import com.mobileboom.util.MySqlDBConn;

public class UsuarioDAO {
	
	public int registraUsuario(Usuario usuario) throws Exception{
		try {
			Connection cn = MySqlDBConn.obtenerConexion();

			String sql=String.format("select count(1) from users where user = %s",usuario.getUsuario());
			PreparedStatement pst=cn.prepareStatement(sql);		
			System.out.println(pst);			
			pst.execute();			
			ResultSet rs=pst.executeQuery();

			if(!rs.next()){
			
				sql=String.format("insert into users(documentTypeId,documentTypeNumber,name,user,password,email,address) "+
										"values (1,%s,%s,%s,%s,%s,%s)",usuario.getNumeroDocumento(),usuario.getNombre(),
										usuario.getUsuario(),usuario.getContrasena(), usuario.getEmail(),usuario.getDireccion());
				
				PreparedStatement pst1=cn.prepareStatement(sql);			
				System.out.println(pst1);			
				System.out.println("Ingreso Correcto.");
				pst1.execute();
			}else{
				System.out.println("Usuario ya ha sido utilizado, elija otro.");
				return 1;
			}
			cn.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		

		return 0;
	}
}

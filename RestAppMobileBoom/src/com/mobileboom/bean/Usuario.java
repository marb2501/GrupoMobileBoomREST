package com.mobileboom.bean;

import java.util.Date;

public class Usuario {

	private String codigoTipoDocumento;
	private String numeroDocumento;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String usuario;
	private String contrasena;
	private String email;
	private String direccion;	
	private Date fechaNacimiento;
	private Integer tipoUsuario;
	private Date fechaAlta;
	private Integer estado;
	
	
	
	public Usuario(String codigoTipoDocumento, String numeroDocumento,
			String nombre, String apellidoPaterno, String apellidoMaterno,
			String usuario, String email, String direccion,
			Date fechaNacimiento, Integer tipoUsuario, Date fechaAlta,
			Integer estado) {
		super();
		this.codigoTipoDocumento = codigoTipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.usuario = usuario;
		this.email = email;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoUsuario = tipoUsuario;
		this.fechaAlta = fechaAlta;
		this.estado = estado;
	}
	
	public Usuario(){};
		
	public String getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}
	public void setCodigoTipoDocumento(String codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	
}

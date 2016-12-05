package com.mobileboom.bean;

public class Publicacion {

	private Integer id;
	private String usuario;
	private String contenido;
	//private Blob imagen;
	private String ubicacion;
	private Integer codigoTipoPublicacion;
	private Integer estado;
	
	
	
	public Publicacion(Integer id, String usuario, String contenido,
			String ubicacion, Integer codigoTipoPublicacion, Integer estado) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contenido = contenido;
		this.ubicacion = ubicacion;
		this.codigoTipoPublicacion = codigoTipoPublicacion;
		this.estado = estado;
	}
	
	public Publicacion(){};
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getCodigoTipoPublicacion() {
		return codigoTipoPublicacion;
	}
	public void setCodigoTipoPublicacion(Integer codigoTipoPublicacion) {
		this.codigoTipoPublicacion = codigoTipoPublicacion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}

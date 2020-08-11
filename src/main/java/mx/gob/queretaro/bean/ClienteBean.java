package mx.gob.queretaro.bean;

import java.io.Serializable;

public class ClienteBean implements Serializable {
	private static final long serialVersionUID = 4704861150860129867L;

	private long id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String estatus;


	public ClienteBean() {
	}

	public ClienteBean(String nombre, long id, String apellidoPaterno, String apellidoMaterno, String estatus) {
		super();
		this.nombre = nombre;
		this.id =id;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.estatus = estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}

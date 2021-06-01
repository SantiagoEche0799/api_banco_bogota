package co.edu.usbbog.bdd.model;

import javax.persistence.Entity;

@Entity
public class ciudad {
	
	private int id;
	private String nombre;
	
	public ciudad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public ciudad() {
		super();
		this.id = 0;
		this.nombre = "";
	}

	public ciudad(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "ciudad [id=" + id + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ciudad other = (ciudad) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	

}

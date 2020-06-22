
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa el nombre y nombre del estadio del equipo
 * 
 * @author Uzqueda Jose
 *
 */
@Component
public class Equipo {
	// Representa nombre el equipo
	private String nombre;
	// Representa el estadio del equipo
	@Autowired
	private Estadio estadio;

	/**
	 * Parametro por defecto
	 */
	public Equipo() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	// -------METODOS ACCESORES-----
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

}

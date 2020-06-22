
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Representa la noticia
 * 
 * @author Uzqueda Jose
 *
 */
@Component
public class Noticia {
	// Fecha de la noticia
	private LocalDate fecha;
	// Representa el titulo de la noticia
	private String titulo;
	// Representa el resumen de la noticia
	private String resumen;

	/**
	 * Constructor por defecto
	 */
	public Noticia() {

	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}

	// -----METODOS ACCESORES-----

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

}

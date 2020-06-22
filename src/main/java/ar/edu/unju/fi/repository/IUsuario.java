package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuario {
	
	//Metodos abstractos
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}

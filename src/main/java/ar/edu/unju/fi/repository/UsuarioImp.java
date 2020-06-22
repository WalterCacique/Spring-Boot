package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Usuario;


@Repository("UsuarioImp")
public class UsuarioImp implements IUsuario {
	
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);
	
	@Override
	public void guardar() {
		//accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("El usuario fue guardado "+ usuario.getApellido()+", "+usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto usuario de la BD
		LOG.info("Se elimino el usuario de la BD");
	}

	@Override
	public Usuario modificar() {
		// se modifican los datos del usuario 
		LOG.info("Se modificaron los datos del usuario");
		return usuario;
	}

}

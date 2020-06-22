package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	@Autowired
	private Estadio estadio;

	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto estadio en la BD
		LOG.info("El estadio fue guardado " + estadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		// se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto usuario de la BD
		LOG.info("Se elimino el usuario de la BD");
	}

	@Override
	public Estadio modificar() {
		// se modifican los datos del estadio
		LOG.info("Se modificaron los datos del estadio");
		return estadio;
	}

}

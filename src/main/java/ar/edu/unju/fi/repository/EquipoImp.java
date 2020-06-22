package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Equipo;
//import ar.edu.unju.fi.model.Estadio;

@Repository("EquipoImp")
public class EquipoImp implements IEquipo {
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto equipo en la BD
		LOG.info("El equipo fue guardado "+equipo.getNombre());
	}

	@Override
	public Equipo mostrar() {
		// se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto usuario de la BD
		LOG.info("Se elimino el equipo de la BD");
	}

	@Override
	public Equipo modificar() {
		// se modifica los datos del equipo
		LOG.info("Se modificaron los datos del equipo");
		return equipo;
	}

}

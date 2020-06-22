package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository("ResultadoImp")
public class ResultadoImp implements IResultado {

	@Autowired
	private Resultado resultado;

	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto resultado en la BD
		LOG.info("El resultado fue guardado..");
	}

	@Override
	public Resultado mostrar() {
		// se recuperan todos los datos del resultado
		LOG.info("Mostrar los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto resultado de la BD
		LOG.info("Se elimino el resultado de la BD");
	}

	@Override
	public Resultado modificar() {
		// se modifican los datos del resultado
		LOG.info("Se modificaron los datos del resultado");
		return resultado;
	}

}

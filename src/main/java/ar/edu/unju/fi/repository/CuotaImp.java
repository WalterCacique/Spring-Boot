package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("CuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;

	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("La cuota fue guardado " + cuota.getUsuario());
	}

	@Override
	public Cuota mostrar() {
		// se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto cuota de la BD
		LOG.info("Se elimino la cuota de la BD");
	}

	@Override
	public Cuota modificar() {
		// se modifican los datos de la cuota 
		LOG.info("Se modificaron los datos de la cuota");
		return cuota;
	}

}

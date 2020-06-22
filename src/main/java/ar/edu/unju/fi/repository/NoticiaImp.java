package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Uzqueda3928Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;

	public static Logger LOG = LoggerFactory.getLogger(Uzqueda3928Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto noticia en la BD
		LOG.info("La noticia fue guardado " + noticia.getTitulo());
	}

	@Override
	public Noticia mostrar() {
		// se recuperan todos los datos de la noticia
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto noticia de la BD
		LOG.info("Se elimino la noticia de la BD");
	}

	@Override
	public Noticia modificar() {
		// se modifican los datos de la noticia
		LOG.info("Se modificaron los datos de la noticia");
		return noticia;
	}

}

package ar.edu.unju.fi.service;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

@Repository
public class IEquipoServiceImp implements IEquipoService {

	private IEquipo iequipo;

	@Override
	public void guardar() {
		iequipo.guardar();
	}

	@Override
	public Equipo mostrar() {
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void eliminar() {
		iequipo.eliminar();
	}

	@Override
	public Equipo modificar() {
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}

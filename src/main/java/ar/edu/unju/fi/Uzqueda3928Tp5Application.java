package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Uzqueda3928Tp5Application implements CommandLineRunner {

	//Inyectamos los beans para realizar la operacion de guardar un objeto y tambien inyectamos las interfaces
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;
	

	public static void main(String[] args) {
		SpringApplication.run(Uzqueda3928Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// inicializacion de las variables de mi objeto usuario
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");

		usuarioService.guardar();
		
		//inicializacion de las variables de mi objeto estadio
		estadio.setCapacidad(70074);
		estadio.setCiudad("Ciudad de Buenos Aires");
		estadio.setDireccion("Figueroa Alcorta");
		estadio.setFechaFundacion(LocalDate.of(1938, 5, 25));
		estadio.setNombre("Monumental");
		
		estadioService.guardar();
		/**
		//inicializacion de las variables de mi objeto equipo
		equipo.setEstadio(estadio);
		equipo.setNombre("River Plate");
		
		equipoService.guardar();
		**/
		//inicializacion de las variables de mi objeto cuota
		cuota.setUsuario(usuario);
		cuota.setEstado("Al dia");
		cuota.setFechaPago(LocalDate.of(2020, 5, 30));
		cuota.setId(123456789);
		cuota.setMonto(20.20);
		cuota.setPeriodo("Mayo");
		
		cuotaService.guardar();
		
		//inicializacion de las variables de mi objeto noticia
		noticia.setTitulo("River Plate campeon!!");
		noticia.setFecha(LocalDate.of(2018, 12, 21));
		noticia.setResumen("Gana la final a su clasico rival");
		
		noticiaService.guardar();
		
		//inicializacion de las variables de mi objeto resultado
		resultado.setFecha(LocalDate.of(2020, 5, 29));
		resultado.setEquipo1(equipo);
		resultado.setEquipo2(equipo);
		resultado.setGolesEquipo1(2);
		resultado.setGolesEquipo2(2);
		
		resultadoService.guardar();
		
		
	}

}

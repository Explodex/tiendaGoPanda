package app.idat.edu.pe.service;

import java.util.List;

import app.idat.edu.pe.model.Orden;
import app.idat.edu.pe.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
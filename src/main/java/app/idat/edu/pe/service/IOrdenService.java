package app.idat.edu.pe.service;

import java.util.List;

import app.idat.edu.pe.model.Orden;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save (Orden orden);

}

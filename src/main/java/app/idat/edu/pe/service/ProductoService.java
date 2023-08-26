package app.idat.edu.pe.service;

import java.util.Optional;

import app.idat.edu.pe.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);

}

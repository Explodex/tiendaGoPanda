package app.idat.edu.pe.service;

import java.util.List;
import java.util.Optional;

import app.idat.edu.pe.model.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);

}
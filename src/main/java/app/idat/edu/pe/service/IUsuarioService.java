package app.idat.edu.pe.service;

import java.util.Optional;

import app.idat.edu.pe.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);
	Usuario save(Usuario usuario);

}

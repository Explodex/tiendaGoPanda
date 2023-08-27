package app.idat.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.idat.edu.pe.model.Orden;

@Repository
public interface IOrdenRepository  extends JpaRepository<Orden, Integer>{

}

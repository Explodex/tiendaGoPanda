package app.idat.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.idat.edu.pe.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
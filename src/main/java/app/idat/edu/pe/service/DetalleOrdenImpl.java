package app.idat.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.idat.edu.pe.model.DetalleOrden;
import app.idat.edu.pe.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenImpl implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}
	
	

}

package com.iudigital.autoscol.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.autoscol.data.FacturaRepository;
import com.iudigital.autoscol.data.RegistroRepository;
import com.iudigital.autoscol.domain.Factura;
import com.iudigital.autoscol.domain.Registro;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepository facturaRepository;
	
	@Autowired
	private RegistroRepository registroRepository;
	
	public void createFactura(Factura factura) {
		
		int idRegistro = factura.getRegistro().getIdRegistro();
		Optional<Registro> registro = registroRepository.findById(idRegistro);
		
		LocalDateTime inicio = registro.get().getFechaEntrada();
		LocalDateTime fin = registro.get().getFechaSalida();
		double diff = ChronoUnit.HOURS.between(inicio, fin);
		
		factura.setHorasParqueo(diff);
		
		factura.setValorHora(factura.getValorHora());
		facturaRepository.save(factura);
	}

	public List<Factura> getFacturas() {
		List<Factura> facturas = (List<Factura>) facturaRepository.findAll();
		return facturas;
	}

	public Factura getFacturaById(int idFactura) {
		Factura factura = facturaRepository.findById(idFactura).orElse(new Factura());
		return factura;

	}
	
	public void editFactura(int idFactura, Factura factura) {

		Factura facturaUpdate = facturaRepository.findById(idFactura).orElse(null);

		if (facturaUpdate != null) {
			facturaUpdate.setValorHora(factura.getValorHora());
			facturaUpdate.setMedioPago(factura.getMedioPago());		
			facturaRepository.save(facturaUpdate);
		}
	}
}

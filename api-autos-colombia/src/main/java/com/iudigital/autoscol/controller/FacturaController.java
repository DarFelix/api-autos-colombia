package com.iudigital.autoscol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iudigital.autoscol.domain.Factura;
import com.iudigital.autoscol.service.FacturaService;

@RestController
@RequestMapping("/factura")
@CrossOrigin("*")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createFactura(@RequestBody Factura factura) {
		facturaService.createFactura(factura);
	}

	@GetMapping
	public List<Factura> getFacturas() {
		return facturaService.getFacturas();
	}

	@GetMapping("/{facturaId}")
	public Factura getFactura(@PathVariable int facturaId) {

		return facturaService.getFacturaById(facturaId);
	}

	@PutMapping("/{facturaId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void editFactura(@PathVariable int facturaId, @RequestBody Factura factura) {
		facturaService.editFactura(facturaId, factura);
	}
	
}


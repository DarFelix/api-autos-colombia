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

import com.iudigital.autoscol.domain.Vehiculo;
import com.iudigital.autoscol.service.VehiculoService;

@RestController
@RequestMapping("/vehiculo")
@CrossOrigin("*")
public class VehiculoController {

	@Autowired
	private VehiculoService vehiculoService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createVehiculo(@RequestBody Vehiculo vehiculo) {
		vehiculoService.createVehiculo(vehiculo);
	}

	@GetMapping
	public List<Vehiculo> getVehiculos() {
		return vehiculoService.getVehiculos();
	}

	@GetMapping("/{vehiculoId}")
	public Vehiculo getVehiculo(@PathVariable int vehiculoId) {

		return vehiculoService.getVehiculoById(vehiculoId);
	}

	@PutMapping("/{vehiculoId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void editVehiculo(@PathVariable int vehiculoId, @RequestBody Vehiculo vehiculo) {
		vehiculoService.editVehiculo(vehiculoId, vehiculo);
	}

}

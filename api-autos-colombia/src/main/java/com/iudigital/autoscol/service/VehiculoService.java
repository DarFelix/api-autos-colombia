package com.iudigital.autoscol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.autoscol.data.VehiculoRepository;
import com.iudigital.autoscol.domain.Vehiculo;

@Service
public class VehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;

	public void createVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}

	public List<Vehiculo> getVehiculos() {
		List<Vehiculo> vehiculos = (List<Vehiculo>) vehiculoRepository.findAll();
		return vehiculos;
	}

	public Vehiculo getVehiculoById(int idVehiculo) {

		Vehiculo car = vehiculoRepository.findById(idVehiculo).orElse(new Vehiculo());
		return car;

	}

	public void editVehiculo(int idVehiculo, Vehiculo vehiculo) {

		Vehiculo carUpdate = vehiculoRepository.findById(idVehiculo).orElse(null);

		if (carUpdate != null) {
			carUpdate.setTipoVehiculo(vehiculo.getTipoVehiculo());
			carUpdate.setMarca(vehiculo.getMarca());
			carUpdate.setModelo(vehiculo.getModelo());
			carUpdate.setColor(vehiculo.getColor());
			carUpdate.setPlaca(vehiculo.getPlaca());
			carUpdate.setObservaciones(vehiculo.getObservaciones());

			vehiculoRepository.save(carUpdate);
		}

	}
}

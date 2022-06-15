package com.iudigital.autoscol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.autoscol.data.RegistroRepository;
import com.iudigital.autoscol.domain.Celda;
import com.iudigital.autoscol.domain.Persona;
import com.iudigital.autoscol.domain.Registro;
import com.iudigital.autoscol.domain.Rol;
import com.iudigital.autoscol.domain.Vehiculo;

@Service
public class RegistroService {

	@Autowired
	private RegistroRepository registroRepository;

	public void createRegistro(Registro registro) {
		registroRepository.save(registro);
	}

	public List<Registro> getRegistros() {
		List<Registro> registros = (List<Registro>) registroRepository.findAll();
		return registros;
	}

	public Registro getRegistroById(int idRegistro) {
		Registro registro = registroRepository.findById(idRegistro).orElse(new Registro());
		return registro;

	}

	public void editRegistro(int idRegistro, Registro registro) {

		Registro registroUpdate = registroRepository.findById(idRegistro).orElse(null);

		if (registroUpdate != null) {
			Persona empleado = new Persona();
			empleado.setIdPersona(registro.getEmpleado().getIdPersona());
			empleado.setTipoDoc(registro.getEmpleado().getTipoDoc());
			empleado.setNumeroDoc(registro.getEmpleado().getNumeroDoc());
			empleado.setNombres(registro.getEmpleado().getNombres());
			empleado.setApellidos(registro.getEmpleado().getApellidos());
			empleado.setTelefonoFijo(registro.getEmpleado().getTelefonoFijo());
			empleado.setTelefonoMovil(registro.getEmpleado().getTelefonoMovil());
			empleado.setDireccion(registro.getEmpleado().getDireccion());
			empleado.setEmail(registro.getEmpleado().getEmail());
			empleado.setPass(registro.getEmpleado().getPass());
			Rol rolEmp = new Rol();
			rolEmp.setIdRol(registro.getEmpleado().getRol().getIdRol());
			rolEmp.setNombre(registro.getEmpleado().getRol().getNombre());
			empleado.setRol(rolEmp);
			registroUpdate.setEmpleado(empleado);

			Celda celda = new Celda();
			celda.setIdCelda(registro.getCelda().getIdCelda());
			celda.setEstado(registro.getCelda().getEstado());
			celda.setTipoVehiculo(registro.getCelda().getTipoVehiculo());
			registroUpdate.setCelda(celda);

			Vehiculo vehiculo = new Vehiculo();
			vehiculo.setIdVehiculo(registro.getVehiculo().getIdVehiculo());
			vehiculo.setTipoVehiculo(registro.getVehiculo().getTipoVehiculo());
			vehiculo.setMarca(registro.getVehiculo().getMarca());
			vehiculo.setModelo(registro.getVehiculo().getModelo());
			vehiculo.setColor(registro.getVehiculo().getColor());
			vehiculo.setPlaca(registro.getVehiculo().getPlaca());
			vehiculo.setObservaciones(registro.getVehiculo().getObservaciones());
			registroUpdate.setVehiculo(vehiculo);

			Persona cliente = new Persona();
			cliente.setIdPersona(registro.getEmpleado().getIdPersona());
			cliente.setTipoDoc(registro.getEmpleado().getTipoDoc());
			cliente.setNumeroDoc(registro.getEmpleado().getNumeroDoc());
			cliente.setNombres(registro.getEmpleado().getNombres());
			cliente.setApellidos(registro.getEmpleado().getApellidos());
			cliente.setTelefonoFijo(registro.getEmpleado().getTelefonoFijo());
			cliente.setTelefonoMovil(registro.getEmpleado().getTelefonoMovil());
			cliente.setDireccion(registro.getEmpleado().getDireccion());
			cliente.setEmail(registro.getEmpleado().getEmail());
			cliente.setPass(registro.getEmpleado().getPass());
			Rol rolCli = new Rol();
			rolCli.setIdRol(registro.getEmpleado().getRol().getIdRol());
			rolCli.setNombre(registro.getEmpleado().getRol().getNombre());
			empleado.setRol(rolCli);
			registroUpdate.setCliente(cliente);

			registroUpdate.setFechaEntrada(registro.getFechaEntrada());
			registroUpdate.setNovedadEntrada(registro.getNovedadEntrada());
			registroUpdate.setFechaSalida(registro.getFechaSalida());
			registroUpdate.setNovedadSalida(registro.getNovedadSalida());

			registroRepository.save(registroUpdate);
		}
	}

}

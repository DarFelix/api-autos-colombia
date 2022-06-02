package com.iudigital.autoscol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.autoscol.data.PersonaRepository;
import com.iudigital.autoscol.domain.Persona;
import com.iudigital.autoscol.domain.Rol;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public void createPersona(Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona> getPersonas() {
		List<Persona> personas = (List<Persona>) personaRepository.findAll();
		return personas;
	}
	
	public Persona getPersonaById(int idPersona) {
		Persona persona = personaRepository.findById(idPersona).orElse(new Persona());
		return persona;

	}
	
	public void editPersona(int idPersona, Persona persona) {

		Persona personaUpdate = personaRepository.findById(idPersona).orElse(null);

		if (personaUpdate != null) {
			personaUpdate.setTipoDoc(persona.getTipoDoc());
			personaUpdate.setNumeroDoc(persona.getNumeroDoc());
			personaUpdate.setNombres(persona.getNombres());
			personaUpdate.setApellidos(persona.getApellidos());
			personaUpdate.setTelefonoFijo(persona.getTelefonoFijo());
			personaUpdate.setTelefonoMovil(persona.getTelefonoMovil());
			personaUpdate.setDireccion(persona.getDireccion());
			personaUpdate.setEmail(persona.getEmail());
			personaUpdate.setPass(persona.getPass());
			
			Rol rol = new Rol();
			rol.setIdRol(persona.getRol().getIdRol());
			rol.setNombre(persona.getRol().getNombre());
			
			personaUpdate.setRol(rol);
		
			personaRepository.save(personaUpdate);
		}

	}

}

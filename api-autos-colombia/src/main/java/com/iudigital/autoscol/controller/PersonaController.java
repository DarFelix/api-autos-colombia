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

import com.iudigital.autoscol.domain.Persona;
import com.iudigital.autoscol.service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin("*")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createPersona(@RequestBody Persona persona) {
		personaService.createPersona(persona);
	}

	@GetMapping
	public List<Persona> getPersonas() {
		return personaService.getPersonas();
	}

	@GetMapping("/{personaId}")
	public Persona getPersona(@PathVariable int personaId) {

		return personaService.getPersonaById(personaId);
	}

	@PutMapping("/{personaId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void editPersona(@PathVariable int personaId, @RequestBody Persona persona) {
		personaService.editPersona(personaId, persona);
	}

}

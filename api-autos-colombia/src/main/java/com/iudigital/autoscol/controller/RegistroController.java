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

import com.iudigital.autoscol.domain.Registro;
import com.iudigital.autoscol.service.RegistroService;

@RestController
@RequestMapping("/registro")
@CrossOrigin("*")
public class RegistroController {

	@Autowired
	private RegistroService registroService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createRegistro(@RequestBody Registro registro) {
		registroService.createRegistro(registro);
	}

	@GetMapping
	public List<Registro> getRegistros() {
		return registroService.getRegistros();
	}

	@GetMapping("/{registroId}")
	public Registro getRegistro(@PathVariable int registroId) {

		return registroService.getRegistroById(registroId);
	}

	@PutMapping("/{registroId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void editRegistro(@PathVariable int registroId, @RequestBody Registro registro) {
		registroService.editRegistro(registroId, registro);
	}

}

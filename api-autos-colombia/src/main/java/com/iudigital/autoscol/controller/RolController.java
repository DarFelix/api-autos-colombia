package com.iudigital.autoscol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iudigital.autoscol.domain.Rol;
import com.iudigital.autoscol.service.RolService;

@RestController
@RequestMapping("/rol")
@CrossOrigin("*")
public class RolController {

	@Autowired
	private RolService rolService;
	
	@GetMapping
	public List<Rol> getRoles() {
		return rolService.getRoles();
	}
	
}

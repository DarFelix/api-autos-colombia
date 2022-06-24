package com.iudigital.autoscol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.autoscol.data.RolRepository;
import com.iudigital.autoscol.domain.Rol;

@Service
public class RolService {

	@Autowired
	private RolRepository rolRepository;
	
	public List<Rol> getRoles() {
		List<Rol> roles = (List<Rol>) rolRepository.findAll();
		return roles;
	}
}

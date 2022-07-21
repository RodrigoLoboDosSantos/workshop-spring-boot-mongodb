package com.rodrigolobodossantos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigolobodossantos.workshopmongo.domain.Usuario;
import com.rodrigolobodossantos.workshopmongo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	public List<Usuario> findAll() {
		return repo.findAll();
	}
}
package com.rodrigolobodossantos.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigolobodossantos.workshopmongo.domain.Usuario;
import com.rodrigolobodossantos.workshopmongo.dto.UsuarioDTO;
import com.rodrigolobodossantos.workshopmongo.repository.UsuarioRepository;
import com.rodrigolobodossantos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	public List<Usuario> findAll() {
		return repo.findAll();
	}
	
	public Usuario findById(String id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not founded"));
	}
	
	public Usuario insert(Usuario obj) {
		return repo.insert(obj);
	}

	public Usuario fromDTO(UsuarioDTO objDto) {
		return new Usuario(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
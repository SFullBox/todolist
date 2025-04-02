package com.correcao.list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.correcao.list.dtos.UsuarioDTO;
import com.correcao.list.services.UsuarioServices;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioServices usuarioServices;
	
	@PostMapping // funciona
	public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO usuarioDTO) {
		usuarioDTO = usuarioServices.salvar(usuarioDTO);
		
		return ResponseEntity.ok(usuarioDTO);
	}

}

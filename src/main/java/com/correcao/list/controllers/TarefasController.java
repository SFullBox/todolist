package com.correcao.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.correcao.list.dtos.TarefaDTO;
import com.correcao.list.entity.Tarefas;
import com.correcao.list.services.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
	
	@Autowired
	TarefaService tarefaService;
	
	@PostMapping // funciona
	public ResponseEntity<TarefaDTO> salvar (@Valid @RequestBody TarefaDTO tarefaDTO){
		
		tarefaDTO = tarefaService.salvar(tarefaDTO);
		
		
		return ResponseEntity.ok(tarefaDTO);
	}
	
	@GetMapping // funciona
	public ResponseEntity<List<Tarefas>> listar(){
		
		return ResponseEntity.ok(tarefaService.listar());
		
	}

}

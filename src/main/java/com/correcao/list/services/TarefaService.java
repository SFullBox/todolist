package com.correcao.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correcao.list.dtos.TarefaDTO;
import com.correcao.list.entity.Tarefas;
import com.correcao.list.entity.Usuario;
import com.correcao.list.enums.Prioridade;
import com.correcao.list.enums.Status;
import com.correcao.list.repository.TarefasRepository;
import com.correcao.list.repository.UsuarioRepository;

@Service
public class TarefaService {

	@Autowired
	TarefasRepository tarefasRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	public TarefaDTO salvar(TarefaDTO dto) {

		Tarefas tarefas = new Tarefas();

		tarefas.setDataCadastro(LocalDate.now());

		tarefas.setDescricao(dto.getDescricao());

		tarefas.setPrioridade(Prioridade.BAIXO);

		tarefas.setSetor(dto.getSetor());

		tarefas.setStatus(Status.A_FAZER);

		Usuario usuario = usuarioRepository.getReferenceById(dto.getId());

		tarefas.setUsuario(usuario);

		tarefas = tarefasRepository.save(tarefas);

		return new TarefaDTO(tarefas);
	}

	public List<Tarefas> listar() {

		List<Tarefas> tarefas = tarefasRepository.findAll();

		return tarefas;
	}

}

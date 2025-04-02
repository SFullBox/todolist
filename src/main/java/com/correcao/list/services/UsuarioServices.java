package com.correcao.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correcao.list.dtos.UsuarioDTO;
import com.correcao.list.entity.Usuario;
import com.correcao.list.repository.UsuarioRepository;

@Service
// tá funfando
public class UsuarioServices { // serve pra criar os metodos pra jogar lá no controller
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO salvar(UsuarioDTO dto) { // aqui definindo o metodo de salvar, e no boddy, ele tá usando
		                                       //o que vem lá do DTO
		
		
		Usuario usuario = new Usuario(); // tá criando um objeto que tá recebendo o que vem de usuario
		
		usuario.setNome(dto.getNome()); // ele pega o que tá vindo do get(que vem do DTO) e 
		                                // manda pro DTO denovo só que no set pra setar
		
		usuario.setEmail(dto.getEmail()); // faz a mesma coisa do de cima, só que com email
		
		usuario = usuarioRepository.save(usuario); // ele tá salvando no banco o que tem em usuario com o metodo save
		
		return new UsuarioDTO(usuario); // isso n precisa, mas é pra aparecer as informações salvas no postman
	}

}

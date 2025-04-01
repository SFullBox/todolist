package com.correcao.list.dtos;

import com.correcao.list.entity.Usuario;

public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email) { // esse é pra quando for criar
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	

	public UsuarioDTO(Usuario entity) { // então só serve pra caso a informação já exista no banco, pra mostrar e pra atualizar
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

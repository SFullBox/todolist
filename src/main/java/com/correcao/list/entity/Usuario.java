package com.correcao.list.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_usuario") // tá funfando
public class Usuario { // aprendi que a entity é o primeiro package e class a ser feito
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(unique = true) //
	private String email;

	@JsonIgnore // criou um loop por algum motivo, dai isso serve pra só aparecer 1x no postman ou em qualquer outro lugar
	@OneToMany(mappedBy = "usuario") //
	private List<Tarefas> tarefas; // precisa definir a class como lista pra dizer que vai puxar um monte de coisa
	
	public Usuario() {}

	public Usuario(Long id, String nome, String email) { // tem a opçãozinha que gera sem o super
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
	

}

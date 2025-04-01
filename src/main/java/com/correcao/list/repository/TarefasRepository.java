package com.correcao.list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.correcao.list.entity.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

}

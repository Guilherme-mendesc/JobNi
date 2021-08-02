package com.empresaN.empresaN.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaN.empresaN.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}

package br.org.generation.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.Farmacia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByAnalgesicoContainingIgnoreCase (String analgesico);

}

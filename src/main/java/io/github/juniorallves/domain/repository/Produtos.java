package io.github.juniorallves.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.juniorallves.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}

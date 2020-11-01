package io.github.juniorallves.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.juniorallves.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}

package io.github.juniorallves.service;

import java.util.Optional;

import io.github.juniorallves.domain.entity.Pedido;
import io.github.juniorallves.domain.enums.StatusPedido;
import io.github.juniorallves.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

package io.github.juniorallves.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.juniorallves.domain.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}

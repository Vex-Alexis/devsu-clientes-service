package com.devsu.clientes.infrastructure.adapters.postgresql.repository;

import com.devsu.clientes.infrastructure.adapters.postgresql.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}

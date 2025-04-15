package com.devsu.clientes.domain.model.cliente.gateways;

import com.devsu.clientes.domain.model.cliente.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClientePostgreSQLGateway {
    Cliente crearCliente(Cliente cliente);
    Cliente actualizarCliente(Long id, Cliente cliente);
    Optional<Cliente> obtenerClientePorId(Long id);
    List<Cliente> obtenerTodosLosClientes();
    void eliminarCliente(Long id);
}

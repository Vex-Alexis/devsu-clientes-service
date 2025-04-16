package com.devsu.clientes.domain.useCase.cliente;

import com.devsu.clientes.domain.model.cliente.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteCRUDUseCase {
    Cliente crearCliente(Cliente cliente);
    Cliente actualizarCliente(Long id, Cliente cliente);
    Optional<Cliente> consultarClientePorId(Long id);
    Optional<Cliente> consultarClientePorIdentificacion(String identificacion);
    List<Cliente> ConsultarClientes();
    void eliminarCliente(Long id);
}

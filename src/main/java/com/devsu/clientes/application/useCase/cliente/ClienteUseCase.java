package com.devsu.clientes.application.useCase.cliente;

import com.devsu.clientes.domain.model.cliente.Cliente;
import com.devsu.clientes.domain.model.cliente.gateways.ClientePostgreSQLGateway;
import com.devsu.clientes.domain.useCase.cliente.ClienteCRUDUseCase;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClienteUseCase implements ClienteCRUDUseCase {
    private final ClientePostgreSQLGateway clientePostgreSQLGateway;

    public ClienteUseCase(ClientePostgreSQLGateway clientePostgreSQLGateway){
        this.clientePostgreSQLGateway = clientePostgreSQLGateway;
    }
    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clientePostgreSQLGateway.crearCliente(cliente);
    }
    @Override
    public Optional<Cliente> consultarClientePorId(Long id) {
        return clientePostgreSQLGateway.obtenerClientePorId(id);
    }

    @Override
    public Optional<Cliente> consultarClientePorIdentificacion(String identificacion) {
        return clientePostgreSQLGateway.obtenerClientePorIdentificacion(identificacion);
    }

    @Override
    public List<Cliente> ConsultarClientes() {
        return clientePostgreSQLGateway.obtenerTodosLosClientes();
    }

    @Override
    public Cliente actualizarCliente(Long id, Cliente cliente) {
        return clientePostgreSQLGateway.actualizarCliente(id, cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clientePostgreSQLGateway.eliminarCliente(id);
    }
}

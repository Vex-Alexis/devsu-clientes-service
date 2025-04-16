package com.devsu.clientes.domain.model;

import com.devsu.clientes.domain.model.cliente.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testCrearClienteYValidarDatos() {
        // Arrange
        Cliente cliente = new Cliente();
        cliente.setClienteId(1L);
        cliente.setNombre("Ana Torres");
        cliente.setGenero("Femenino");
        cliente.setEdad(30);
        cliente.setIdentificacion("1098765432");
        cliente.setDireccion("Calle 45 #67-89");
        cliente.setTelefono("3011234567");
        cliente.setContraseña("segura123");
        cliente.setEstado(true);

        // Act & Assert
        assertEquals(1L, cliente.getClienteId());
        assertEquals("Ana Torres", cliente.getNombre());
        assertEquals("Femenino", cliente.getGenero());
        assertEquals(30, cliente.getEdad());
        assertEquals("1098765432", cliente.getIdentificacion());
        assertEquals("Calle 45 #67-89", cliente.getDireccion());
        assertEquals("3011234567", cliente.getTelefono());
        assertEquals("segura123", cliente.getContraseña());
        assertTrue(cliente.getEstado());
    }
}

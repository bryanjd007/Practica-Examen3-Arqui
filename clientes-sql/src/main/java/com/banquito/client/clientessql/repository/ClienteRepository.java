package com.banquito.client.clientessql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banquito.client.clientessql.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, String> {

    Cliente findByTipoIdentificacionAndIdentificacion(String tipoIdentificacion, String identificacion);
    //obtener todos los clientes con findAll()
    List<Cliente> findAll();

    List<Cliente> findByPkIdentification(String identification);
}

package com.banquito.client.clientessql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banquito.client.clientessql.model.Cliente;
import com.banquito.client.clientessql.repository.ClienteRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    public Cliente buscarClientePorTipoIdentificacionAndIdentificacion(String tipoIdentificacion, String identificacion) {
        log.info("Va a recuperar cliente por Tipo identificacion: {} y identeificacion:{}", tipoIdentificacion,identificacion);
        Cliente cliente = this.clienteRepository.findByTipoIdentificacionAndIdentificacion(tipoIdentificacion,identificacion);
        if (cliente==null) {
            log.info("Cliente no obtenido por identificacion: {} y identeificacion:{}", tipoIdentificacion,identificacion);
            throw new RuntimeException("The client does not exist");
        }
        log.info("Cliente obtenido por codigo por Tipo identificacion: {} y identeificacion:{} ->{}", tipoIdentificacion,identificacion,cliente);
        return cliente;
    }
}

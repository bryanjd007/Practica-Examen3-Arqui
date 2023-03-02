package com.banquito.client.clientessql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @Column(name = "TIPO_IDENTIFICACION", length = 3, nullable = false)
    public String tipoIdentificacion;
    @Column(name = "IDENTIFICACION", length = 20, nullable = false)
    public String identificacion;
    @Column(name = "APELLIDOS", length = 64, nullable = false)
    public String apellido;
    @Column(name = "NOMBRES", length = 64, nullable = false)
    public String nombres;
    @Column(name = "NOMBRE_COMPLETO", length = 128, nullable = false)
    public String nombreCompleto;
    @Column(name = "EMAIL", length = 128, nullable = false)
    public String email;
}
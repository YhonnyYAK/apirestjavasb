package com.microservicio.servicio.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Message {

    @Getter @Setter
    private Integer codigo;
    @Getter @Setter
    private String mensaje;
}

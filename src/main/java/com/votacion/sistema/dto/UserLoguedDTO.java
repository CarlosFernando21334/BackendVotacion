package com.votacion.sistema.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserLoguedDTO implements Serializable {
    private String token;
    private String username;
    private boolean voto;
    private String candidato;
    private String email;
    private String rol;
}

package com.votacion.sistema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Role rol;
    @ManyToOne
    private Candidato candidato;
}

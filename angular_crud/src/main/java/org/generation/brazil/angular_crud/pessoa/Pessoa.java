package org.generation.brazil.angular_crud.pessoa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

}

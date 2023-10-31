package br.senac.rn.clinica.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ANIMAIS")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANI_ID")
    private Integer id;

    @Column(name = "ANI_NOME")
    private String nome;

    @Column(name = "ANI_TIPO")
    private String tipo;

    @Column(name = "ANI_RACA")
    private String raca;

    @Column(name = "ANI_IDADE")
    private Integer idade;

}

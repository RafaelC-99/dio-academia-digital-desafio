package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data //Getters //Setters //Equals //Hashcode
@NoArgsConstructor //Construtor sem argumento
@AllArgsConstructor //Construtor com todos os argumentos
@Entity //Anotacao de persistencia, indicando que é uma tabela
@Table(name = "tb_aluno")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)    //1 aluno possui varias avaliacoes fisicas | mappedBy = atributo
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}

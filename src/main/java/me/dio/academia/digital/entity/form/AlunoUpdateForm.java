package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data //Getters //Setters //Equals //Hashcode
@NoArgsConstructor //Construtor sem argumento
@AllArgsConstructor //Construtor com todos os argumentos
public class AlunoUpdateForm {
    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}

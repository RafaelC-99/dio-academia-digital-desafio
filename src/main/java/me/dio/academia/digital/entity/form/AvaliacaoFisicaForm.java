package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters //Setters //Equals //Hashcode
@NoArgsConstructor //Construtor sem argumento
@AllArgsConstructor //Construtor com todos os argumentos
public class AvaliacaoFisicaForm {
    private Long alunoId;

    private double peso;

    private double altura;
}

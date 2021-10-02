package br.com.letscode.java;

import lombok.*;

import java.time.LocalDate;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/
@Data //menos com construtor definido

public class Cliente {
    private int test;
    private String git;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
}

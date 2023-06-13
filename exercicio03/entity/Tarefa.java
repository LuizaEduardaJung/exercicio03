package com.example.exercicio03.entity;

import com.example.exercicio03.entity.Enum.Prioridade;
import com.example.exercicio03.entity.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tarefa {
 private Long id;
 private String titulo;
 private String descricao;
 private LocalDateTime dataDeVencimento;
 private Status status;
 private Prioridade prioridade;
 private String responsavel;
 private LocalDateTime dataDaCriacao;
 private LocalDateTime dataDaConclusao;
}

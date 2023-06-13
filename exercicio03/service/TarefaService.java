package com.example.exercicio03.service;

import com.example.exercicio03.entity.Tarefa;

import com.example.exercicio03.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> buscarTarefas(){
    return tarefaRepository.buscarTarefas();
}
    public Tarefa buscarTarefaPorId(Long id){
        return tarefaRepository.buscarTarefaPorId(id);
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefa){
        return tarefaRepository.atualizarTarefa(id, tarefa);
    }

    public Tarefa adicionarTarefa(Tarefa tarefa){
        return tarefaRepository.adicionarTarefa(tarefa);
    }

}

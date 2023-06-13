package com.example.exercicio03.repository;

import com.example.exercicio03.entity.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TarefaRepository {
    List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> buscarTarefas() {
        return tarefas;
    }

    public Tarefa buscarTarefaPorId(Long id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
    public Tarefa adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
        return tarefa;
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefa){
        Tarefa tarefa1 = buscarTarefaPorId(id);
        if(tarefa1 != null){
            tarefas.remove(tarefa1);
            tarefa.setId(id);
            tarefas.add(tarefa);
            return tarefa;
        }
        return null;
    }
}

package com.example.exercicio03.controller;

import com.example.exercicio03.entity.Tarefa;
import com.example.exercicio03.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("tarefas")
    public List<Tarefa> listarTarefas(){
        return tarefaService.buscarTarefas();
    }

    @GetMapping("tarefa/{id}")
    public Tarefa buscarTarefaPorId(@PathVariable long id){
        return tarefaService.buscarTarefaPorId(id);
    }

    @PostMapping("tarefa")
    public Tarefa salvarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.adicionarTarefa(tarefa);

    }

    @PutMapping("atualizar/{id}")
    public Tarefa atualizarTarefa(@PathVariable long id, @RequestBody Tarefa tarefa){
        return tarefaService.atualizarTarefa(id, tarefa);
    }




}

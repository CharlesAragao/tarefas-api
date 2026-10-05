package com.example.tarefas;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tarefas")

public class TarefaController {
    
    @GetMapping
    public List<Tarefa> listar() {
        return List.of(
            new Tarefa(1L, "Estudar Spring Boot", false),
            new Tarefa(2L, "Criar primeiro endpoint", true)
        );
    }
}

package com.example.todo.controller;

import com.example.todo.entity.Todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable(value = "id") Long id) {
        Todo todo = todoService.getTodoById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        return ResponseEntity.ok().body(todo);
    }

    @PostMapping
    public Todo createTodo(@Valid @RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable(value = "id") Long id, @Valid @RequestBody Todo todoDetails) {
        Todo updatedTodo = todoService.updateTodo(id, todoDetails);
        return ResponseEntity.ok(updatedTodo);
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<Todo> markTodoAsCompleted(@PathVariable(value = "id") Long id) {
        Todo updatedTodo = todoService.markTodoAsCompleted(id);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable(value = "id") Long id) {
        todoService.deleteTodoById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/count")
    public long countTodos() {
        return todoService.countTodos();
    }
}

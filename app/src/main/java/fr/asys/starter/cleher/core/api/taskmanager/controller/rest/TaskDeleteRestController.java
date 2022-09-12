package fr.asys.starter.cleher.core.api.taskmanager.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.asys.starter.cleher.core.api.taskmanager.service.TaskDeleteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/tasks")
@Tag(name = "task-deletion", description = "Pour supprimer les tâches")
public class TaskDeleteRestController {
    private final TaskDeleteService taskDeleteService;

    public TaskDeleteRestController(TaskDeleteService taskDeleteService) {
        this.taskDeleteService = taskDeleteService;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "Supprimer une tâche grace à son identifiant", operationId = "deleteTask")
    public ResponseEntity<Integer> deleteTask(@PathVariable("id") final int id) {
        taskDeleteService.execute(id);
        return ResponseEntity.ok(id);
    }
}

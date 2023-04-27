package ynov.eval.core.api.taskmanager.mapper;

import org.springframework.stereotype.Component;
import ynov.eval.core.api.taskmanager.dto.TaskDto;
import ynov.eval.core.api.taskmanager.model.Task;

@Component
public class TaskMapper {

    public TaskDto map(final Task task) {
        final TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTask(task.getTask());
        taskDto.setDone(task.isDone());
        return taskDto;
    }
}

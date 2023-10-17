package br.com.tiagosantana.todolist.task;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositoryInterface extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
}

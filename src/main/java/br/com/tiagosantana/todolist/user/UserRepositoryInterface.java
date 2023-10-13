package br.com.tiagosantana.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username);
}

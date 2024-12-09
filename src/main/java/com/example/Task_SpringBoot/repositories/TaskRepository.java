package com.example.Task_SpringBoot.repositories;

import com.example.Task_SpringBoot.dto.TaskDTO;
import com.example.Task_SpringBoot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByTitleContaining(String title);

    List<Task> findAllUserById(Long id);
}

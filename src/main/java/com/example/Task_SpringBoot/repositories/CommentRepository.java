package com.example.Task_SpringBoot.repositories;

import com.example.Task_SpringBoot.dto.CommentDTO;
import com.example.Task_SpringBoot.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByTaskId(Long taskId);
}

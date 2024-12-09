package com.example.Task_SpringBoot.dto;

import com.example.Task_SpringBoot.enums.TaskStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    private Long id;

    private String title;

    private String description;

    private Date dueDate;

    private String priority;

    private TaskStatus taskStatus;

    private Long employee;

    private String employeeName;
}

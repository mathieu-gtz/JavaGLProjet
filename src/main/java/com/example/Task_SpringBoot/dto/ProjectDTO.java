package com.example.Task_SpringBoot.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProjectDTO {
    private Long id;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

}

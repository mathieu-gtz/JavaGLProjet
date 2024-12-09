package com.example.Task_SpringBoot.entities;


import com.example.Task_SpringBoot.dto.ProjectDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Task> tasks;

    public ProjectDTO getProjectDTO() {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(id);
        projectDTO.setTitle(title);
        projectDTO.setDescription(description);
        projectDTO.setStartDate(startDate);
        projectDTO.setEndDate(endDate);

        return projectDTO;
    }



}

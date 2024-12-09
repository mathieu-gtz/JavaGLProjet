package com.example.Task_SpringBoot.dto;

import com.example.Task_SpringBoot.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;
}

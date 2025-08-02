package com.skysoft.learnKafka.user_service.dto;

import lombok.Data;

@Data
public class CreateUserRequestDto {

    private Long id;
    private String fullName;
    private String email;
}

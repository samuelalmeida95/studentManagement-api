package com.samuel.crudalunos.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandartError {
    private Integer status;
    private Long timestamp;
    private String message;

}


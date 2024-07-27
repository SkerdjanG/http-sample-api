package com.skerdy.sample.api.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleResponseDto {

    private String id;

    private String stringValue;

    public static SimpleResponseDto sample() {
        return new SimpleResponseDto(UUID.randomUUID().toString(), "Success");
    }
}

package com.skerdy.sample.api.controller.post.dto.simple;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRequestDto {

    @NotBlank
    private String stringValue;

    private Boolean booleanValue;

    private Integer integerValue;

    private Double doubleValue;

    private Float floatValue;

    private Long longValue;

    private Short shortValue;

    private BigDecimal bigDecimalValue;

    private Character characterValue;

}

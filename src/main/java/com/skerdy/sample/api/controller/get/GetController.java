package com.skerdy.sample.api.controller.get;

import com.skerdy.sample.api.controller.dto.SimpleErrorResponseDto;
import com.skerdy.sample.api.controller.dto.SimpleResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetController {

    @GetMapping("/simple")
    public ResponseEntity<SimpleResponseDto> simpleResponse() {
        return ResponseEntity.ok(SimpleResponseDto.sample());
    }

    @GetMapping("/error/400")
    public ResponseEntity<?> error400() {
        return ResponseEntity.badRequest()
                .body(SimpleErrorResponseDto.builder()
                        .code("400")
                        .message("Random bad request!")
                        .build());
    }

    @GetMapping("/error/500")
    public ResponseEntity<?> error500() {
        return ResponseEntity.internalServerError()
                .body(SimpleErrorResponseDto.builder()
                        .code("500")
                        .message("Random internal server error!")
                        .build());
    }

}

package com.skerdy.sample.api.controller.put;

import com.skerdy.sample.api.controller.dto.SimpleResponseDto;
import com.skerdy.sample.api.controller.post.dto.simple.SimpleRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/put")
public class PutController {

    @PutMapping("/simple")
    public ResponseEntity<SimpleResponseDto> simpleResponse(@RequestBody SimpleRequestDto simpleRequestDto) {
        return ResponseEntity.ok(SimpleResponseDto.sample());
    }

}

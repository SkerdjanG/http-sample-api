package com.skerdy.sample.api.controller.post;

import com.skerdy.sample.api.controller.post.dto.simple.SimpleRequestDto;
import com.skerdy.sample.api.controller.dto.SimpleResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @PostMapping("/simple")
    public ResponseEntity<SimpleResponseDto> simpleResponse(@RequestBody SimpleRequestDto simpleRequestDto) {
        return ResponseEntity.ok(SimpleResponseDto.sample());
    }

}

package com.viago.controller;

import com.viago.advices.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin("*")
@Tag(name = "Captain API's")
@RequestMapping("/api/v1/captain")
public class CaptainController {

    @GetMapping
    public ResponseEntity<?> getCaption() {
        log.info("Hello");
        return ResponseEntity.ok(ApiResponse.builder().data("Hello").httpStatus(HttpStatus.OK).build());
    }

}

package com.viago.advices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    @JsonProperty("status_code")
    private HttpStatus httpStatus;
    @JsonProperty("time")
    private final LocalDateTime localDateTime = LocalDateTime.now();
    @JsonProperty("data")
    private T data;
    @JsonProperty("error")
    private ApiError apiError;
}

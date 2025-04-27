package com.viago.advices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {
    @JsonProperty("message")
    private String message;
    @JsonProperty("sub_message")
    private List<?> subMessage;
    @JsonProperty("stack_trace")
    private String stackTrace;
}

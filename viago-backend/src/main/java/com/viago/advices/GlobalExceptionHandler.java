package com.viago.advices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @Value("${spring.profiles.active}")
    private String env;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<ApiError>> handleGeneralException(Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.internalServerError().body(
                    ApiResponse.<ApiError>builder()
                            .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                            .apiError(ApiError.builder()
                                .stackTrace((env != null && env.equalsIgnoreCase("dev")) ? getStackTraceAsString(e) : null)
                                .message(e.getMessage()).build())
                            .build()
            );
    }

    private static String getStackTraceAsString(Exception ex) {
        StringBuilder stackTrace = new StringBuilder();
        for (StackTraceElement element : ex.getStackTrace()) {
            stackTrace.append(element.toString()).append("\n");
        }
        return stackTrace.toString();
    }
}

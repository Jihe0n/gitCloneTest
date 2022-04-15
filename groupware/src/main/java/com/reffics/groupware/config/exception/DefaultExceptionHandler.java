package com.reffics.groupware.config.exception;

import com.reffics.groupware.svc.common.model.ApiResult;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(0)
@RestControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RefficsException.class)
    public ResponseEntity<Object> handlerRefficsException(RefficsException e, WebRequest request) {
        return generateResponseEntity(HttpStatus.BAD_REQUEST, e.getErrorCode(), e.getMessage());
    }

    private ResponseEntity<Object> generateResponseEntity(HttpStatus httpStatus, String code, String message) {
        return generateResponseEntity(httpStatus, code, message, null);
    }

    private ResponseEntity<Object> generateResponseEntity(HttpStatus httpStatus, String code, String message, Object data) {
        return new ResponseEntity<>(
                ApiResult.builder().status(httpStatus.value()).code(code).message(message).data(data).build(), new HttpHeaders(), httpStatus
        );
    }
}

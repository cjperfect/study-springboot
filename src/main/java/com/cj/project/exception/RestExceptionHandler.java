package com.cj.project.exception;

import com.cj.project.common.response.BaseResponse;
import com.cj.project.common.response.ResponseCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class RestExceptionHandler {


    @ExceptionHandler(Exception.class)
    public BaseResponse<String> exception(Exception e) {
        return BaseResponse.fail(ResponseCode.RC500.getCode(), e.getMessage());
    }
}

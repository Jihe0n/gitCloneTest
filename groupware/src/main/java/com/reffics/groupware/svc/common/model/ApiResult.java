package com.reffics.groupware.svc.common.model;

import lombok.Data;

@Data
public class ApiResult {

    private int status;

    private String code;

    private String message;

    private Object data;

    public ApiResult() {
    }

    public static ApiResultBuilder builder() {
        return new ApiResultBuilder();
    }


}

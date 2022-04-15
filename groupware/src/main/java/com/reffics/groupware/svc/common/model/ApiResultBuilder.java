package com.reffics.groupware.svc.common.model;

public class ApiResultBuilder {

    private int status;

    private String code;

    private String message;

    private Object data;

    public ApiResultBuilder status(int status) {
        this.status = status;
        return this;
    }

    public ApiResultBuilder code(String code) {
        this.code = code;
        return this;
    }

    public ApiResultBuilder message(String message) {
        this.message = message;
        return this;
    }

    public ApiResultBuilder data(Object data) {
        this.data = data;
        return this;
    }

    public ApiResult build() {
        ApiResult apiResult = new ApiResult();
        apiResult.setStatus(this.status);
        apiResult.setCode(this.code);
        apiResult.setMessage(this.message);
        apiResult.setData(this.data);
        return apiResult;
    }
}


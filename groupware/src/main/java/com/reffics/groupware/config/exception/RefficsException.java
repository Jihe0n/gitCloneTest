package com.reffics.groupware.config.exception;

public class RefficsException extends RuntimeException {

    private final String errorCode;

    private final String message;

    private final Object data;

    public RefficsException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
        this.message = null;
        this.data = null;
    }

    public RefficsException(String errorCode, String message) {
        super(errorCode);
        this.errorCode = errorCode;
        this.message = message;
        this.data = null;
    }

    public RefficsException(String errorCode, Object data) {
        super(errorCode);
        this.errorCode = errorCode;
        this.message = null;
        this.data = data;
    }

    public RefficsException(String errorCode, String message, Object data) {
        super(errorCode);
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}

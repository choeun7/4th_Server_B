package umc.naver.error.exception;

import lombok.Getter;
import umc.naver.error.ErrorCode;
import umc.naver.error.ErrorResponse;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BusinessException extends RuntimeException {

    private ErrorCode errorCode;
    private List<ErrorResponse.FieldError> errors = new ArrayList<>();

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode, List<ErrorResponse.FieldError> errors) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errors = errors;
    }
}


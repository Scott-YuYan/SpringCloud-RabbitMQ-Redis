package cn.itcast.order.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private int statusCode;
    private String code;
    private ServiceException.ErrorType errorType;
    private String message;
}


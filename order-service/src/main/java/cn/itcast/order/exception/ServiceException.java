package cn.itcast.order.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException {

    private int statusCode;
    private String errorCode;
    public ServiceException.ErrorType errorType;


    public enum ErrorType {
        Client,
        Server,
        Unknown
    }

    public ServiceException(String message) {
        super(message);
    }

}

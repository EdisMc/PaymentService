package com.example.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Payment unavailable!!!")
public class PaymentServiceException extends RuntimeException {
}

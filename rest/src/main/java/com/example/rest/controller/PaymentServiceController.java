package com.example.rest.controller;

import com.example.api.payment.PaymentServiceRequest;
import com.example.api.payment.PaymentServiceResponse;
import com.example.core.PaymentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {
    private final PaymentService paymentService;

    public PaymentServiceController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pay")
    public PaymentServiceResponse pay(@RequestBody PaymentServiceRequest paymentServiceRequest) {
        return paymentService.payRent(paymentServiceRequest);
    }
}

package com.example.core;

import com.example.api.payment.PaymentServiceRequest;
import com.example.api.payment.PaymentServiceResponse;

public interface PaymentService {
    PaymentServiceResponse payRent(PaymentServiceRequest paymentServiceRequest);
}

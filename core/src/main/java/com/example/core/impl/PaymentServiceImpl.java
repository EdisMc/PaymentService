package com.example.core.impl;


import com.example.api.payment.PaymentServiceRequest;
import com.example.api.payment.PaymentServiceResponse;
import com.example.core.PaymentService;
import com.example.core.exception.PaymentServiceException;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private int min = 0;
    private int max = 1000;

    @Override
    public PaymentServiceResponse payRent(PaymentServiceRequest paymentServiceRequest) {

        double randomBalance = Math.random() * (max - min) + min;

        try {
            if (paymentServiceRequest.getCardNumber().length() != 16) {
                return PaymentServiceResponse
                    .builder()
                    .responseStatus(400)
                    .message("Not valid card!")
                    .build();
            }

            if (paymentServiceRequest.getTotalPriceForRent() > randomBalance) {
                return PaymentServiceResponse
                    .builder()
                    .responseStatus(400)
                    .message("Your balance isn't valid!")
                    .build();
            }

            return PaymentServiceResponse
                .builder()
                .responseStatus(200)
                .message("Payment is successful!")
                .build();

        } catch(Exception e) {
            throw new PaymentServiceException();
        }

    }
}

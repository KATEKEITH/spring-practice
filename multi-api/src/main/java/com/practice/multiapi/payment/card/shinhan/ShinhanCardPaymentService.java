package com.practice.multiapi.payment.card.shinhan;

import org.springframework.stereotype.Service;

import com.practice.multiapi.payment.dto.CardPaymentDto.PaymentRequest;
import com.practice.multiapi.payment.service.PaymentService;

@Service
public class ShinhanCardPaymentService implements PaymentService {

    private ShinhanCardApi shinhanCardApi;

    public ShinhanCardPaymentService(ShinhanCardApi shinhanCardApi) {
        this.shinhanCardApi = shinhanCardApi;
    }

    @Override
    public void pay(PaymentRequest req) {
        final ShinhanCardDto.PaymentRequest paymentRequest = ShinhanCardDto.PaymentRequest.builder()
                .shinhanCardNumber(req.getCardNumber())
                .cvc(req.getCsv())
                .build();
        shinhanCardApi.pay(paymentRequest);
    }

}

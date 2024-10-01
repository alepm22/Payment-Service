package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void processPayment() {
         PaymentService paymentService = new PaymentService();
            PaymentRequestDto validRequest = new PaymentRequestDto("22222222222", "567", "07/24", 100);
            assertTrue(paymentService.processPayment(validRequest));
        }

    }

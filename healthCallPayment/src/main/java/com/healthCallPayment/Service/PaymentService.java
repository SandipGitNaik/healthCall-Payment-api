package com.healthCallPayment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthCallPayment.Entity.Payment;
import com.healthCallPayment.Repository.PaymentRepository;

@Service
public class PaymentService {
@Autowired
private PaymentRepository paymentRepository;
	public Payment save(Payment p) {
		// TODO Auto-generated method stub
		return paymentRepository.save(p);
	}
	public List<Payment> get() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

}

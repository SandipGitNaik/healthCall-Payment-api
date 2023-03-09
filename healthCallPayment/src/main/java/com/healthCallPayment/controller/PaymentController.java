package com.healthCallPayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCallPayment.Entity.Payment;
import com.healthCallPayment.Service.PaymentService;

@RestController
@RequestMapping("/payment/")
public class PaymentController {
	@Autowired
	private PaymentService paymentService; 
      @PostMapping("save")
      public Payment oneSave(@RequestBody Payment P) {
    	  return paymentService.save(P);
      }
      @GetMapping("get")
      public List<Payment> getAll(){
    	  return paymentService.get();
      }
}

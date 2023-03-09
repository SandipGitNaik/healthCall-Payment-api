package com.healthCallPayment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthCallPayment.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}

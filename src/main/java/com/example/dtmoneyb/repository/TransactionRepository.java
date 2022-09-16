package com.example.dtmoneyb.repository;

import com.example.dtmoneyb.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}

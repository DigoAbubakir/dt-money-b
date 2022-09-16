package com.example.dtmoneyb.controller;

import com.example.dtmoneyb.entity.Transaction;
import com.example.dtmoneyb.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public Transaction saveTransaction(@RequestBody Transaction transaction) {
        return transactionService.save(transaction);
    }

    @GetMapping
    public List<Transaction> listAll() {
        return transactionService.listAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        transactionService.delete(id);
    }
}

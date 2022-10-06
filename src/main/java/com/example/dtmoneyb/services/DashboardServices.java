package com.example.dtmoneyb.services;

import com.example.dtmoneyb.controller.dto.DashboardResponseDTO;
import com.example.dtmoneyb.entity.Transaction;
import com.example.dtmoneyb.entity.TransactionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardServices {

    private final TransactionService transactionService;

    public DashboardResponseDTO getDashboard() {
        List<Transaction> transactions = transactionService.listAll();

        double outcome = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getType() == TransactionType.OUTCOME) {
                outcome = outcome + transaction.getPrice();
            }
        }

        double income = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getType() == TransactionType.INCOME) {
                income = income + transaction.getPrice();
            }
        }

        DashboardResponseDTO response = new DashboardResponseDTO();
        response.setIncome(income);
        response.setOutcome(outcome);
        response.setTotal(income - outcome);

        return response;
    }
}

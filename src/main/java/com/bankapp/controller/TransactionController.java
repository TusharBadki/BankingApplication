package com.bankapp.controller;

import com.bankapp.dto.TransactionDto;
import com.bankapp.service.AccountTransactionsService;
import jakarta.validation.constraints.Min;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
@Validated
public class TransactionController {

    private AccountTransactionsService accountTransactionsService;

    public TransactionController(AccountTransactionsService accountTransactionsService) {
        this.accountTransactionsService = accountTransactionsService;
    }

    @GetMapping("/account/{accountNumber}/gettransactions")
    public ResponseEntity<List<TransactionDto>> getTransactionsByAccountNo(@PathVariable("accountNumber") @Min(value = 9999, message = "AccountNumber must be numerical and must be 5 digit value") Long accountNumber) {

        log.info("gettransactions API called  of the logged in user for account number : {}", accountNumber);
        List<TransactionDto> transactionDtoList = accountTransactionsService
                .getTransactionsByAccountNumber(accountNumber);

        return ResponseEntity.ok(transactionDtoList);
    }

}
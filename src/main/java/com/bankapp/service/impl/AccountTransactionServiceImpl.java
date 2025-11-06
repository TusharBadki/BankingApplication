package com.bankapp.service.impl;

import com.bankapp.dto.TransactionDto;
import com.bankapp.exception.AccountNotFoundException;
import com.bankapp.mapper.TransactionMapper;
import com.bankapp.repository.TransactionRepository;
import com.bankapp.service.AccountTransactionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AccountTransactionServiceImpl implements AccountTransactionsService {

    private TransactionRepository transactionRepository;

    public AccountTransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionDto> getTransactionsByAccountNumber(Long accountNumber) {

        log.info("Getting transaction details of the user for account number : {}", accountNumber);

        return Optional.ofNullable(transactionRepository.findByAccountNumber(accountNumber))
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new AccountNotFoundException("No records found for given account number", accountNumber))
                .stream()
                .map(TransactionMapper::mapToTransactionDto)
                .collect(Collectors.toList());
    }
}

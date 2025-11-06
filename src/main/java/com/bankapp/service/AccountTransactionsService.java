package com.bankapp.service;

import com.bankapp.dto.TransactionDto;

import java.util.List;

public interface AccountTransactionsService {

    public List<TransactionDto> getTransactionsByAccountNumber(Long accountNumber);
}

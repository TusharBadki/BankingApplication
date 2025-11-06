package com.bankapp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class TransactionDto {

    @NotNull(message = "Account Number can not be null")
    private Long accountNumber;

    private String accountType;
    private Date transactionDate;
    private String currency;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private String transactionType;
    private String transactionNarrative;

}

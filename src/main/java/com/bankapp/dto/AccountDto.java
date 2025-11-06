package com.bankapp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class AccountDto {

    @NotNull(message = "Account Number can not be null")
    private Long accountNumber;

    private String accountName;
    private String accountType;
    private Date balanceDate;
    private String currency;
    private BigDecimal openingAvailableBalance;

}

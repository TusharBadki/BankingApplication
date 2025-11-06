package com.bankapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_account_transactions")
@Entity
public class Transaction {

    @Id
    @Column(name = "user_account_transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAccountTransactionId;

    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "transaction_date_date")
    private Date transactionDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "debit_amount")
    private BigDecimal debitAmount;

    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_narrative")
    private String transactionNarrative;

}

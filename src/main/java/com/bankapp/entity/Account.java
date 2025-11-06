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
@Table(name = "user_accounts")
@Entity
public class Account {

    @Id
    @Column(name = "user_account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAccountId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "account_number")
    private Long accountNumber;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "balance_date")
    private Date balanceDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "opening_available_balance")
    private BigDecimal openingAvailableBalance;

}

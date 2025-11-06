package com.bankapp.mapper;

import com.bankapp.dto.AccountDto;
import com.bankapp.entity.Account;

public class AccountMapper {

    public static AccountDto mapToAccountDto(Account account) {

        AccountDto accountDto = new AccountDto(
                account.getAccountNumber(), account.getAccountName(), account.getAccountType(),
                account.getBalanceDate(), account.getCurrency(), account.getOpeningAvailableBalance());

        return accountDto;
    }

}

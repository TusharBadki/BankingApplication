package com.bankapp.service;

import com.bankapp.dto.AccountDto;

import java.util.List;

public interface AccountService {

    public List<AccountDto> getAllUserAccounts();

}
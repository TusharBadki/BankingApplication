package com.bankapp.service.impl;

import com.bankapp.dto.AccountDto;
import com.bankapp.entity.Account;
import com.bankapp.mapper.AccountMapper;
import com.bankapp.repository.AccountRepository;
import com.bankapp.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountDto> getAllUserAccounts() {

        log.info("Getting all account details of the logged in user");
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
    }

}

package com.bankapp.controller;

import com.bankapp.dto.AccountDto;
import com.bankapp.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getaccounts")
    public ResponseEntity<List<AccountDto>> getAllUserAccounts() {

        log.info("getaccounts API called for the logged in user");
        List<AccountDto> accountDtoList = accountService.getAllUserAccounts();
        return ResponseEntity.ok(accountDtoList);
    }

}

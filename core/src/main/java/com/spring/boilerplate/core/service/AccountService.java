package com.spring.boilerplate.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boilerplate.core.entity.account.Account;
import com.spring.boilerplate.core.entity.user.User;
import com.spring.boilerplate.core.querydsl.account.CustomAccountRepository;
import com.spring.boilerplate.core.repository.account.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private final AccountRepository accountRepository;
	private final CustomAccountRepository customAccountRepository;

	public Account create(User user) {
		return accountRepository.save(Account.of("1234-12345", user));
	}

	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	public String getById(Long id) {
		return customAccountRepository.retrieveById(id);
	}
}

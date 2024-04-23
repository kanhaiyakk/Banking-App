package com.cts.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{


}
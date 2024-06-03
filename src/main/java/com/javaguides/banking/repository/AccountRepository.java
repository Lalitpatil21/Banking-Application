package com.javaguides.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}

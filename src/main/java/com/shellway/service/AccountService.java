package com.shellway.service;

import com.shellway.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();

    public void save(Account account);

    public Account findById(Integer id);

    public void update(Account account);

    public void delete(Integer[] ids);
}

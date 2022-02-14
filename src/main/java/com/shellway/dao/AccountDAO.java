package com.shellway.dao;

import com.shellway.domain.Account;

import java.util.List;

public interface AccountDAO {
    public List<Account> findAll();
    public void save(Account account);

    public Account findById(Integer id);

    public void update(Account account);

    public void delete(Integer[] ids);
}

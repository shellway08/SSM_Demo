package com.shellway.service.impl;

import com.shellway.dao.AccountDAO;
import com.shellway.domain.Account;
import com.shellway.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public List<Account> findAll() {
        List<Account> all = accountDAO.findAll();
        return all;
    }

    @Override
    public void save(Account account) {
        accountDAO.save(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountDAO.findById(id);
    }

    @Override
    public void update(Account account) {
        accountDAO.update(account);
    }

    @Override
    public void delete(Integer[] ids) {
        accountDAO.delete(ids);
    }
}

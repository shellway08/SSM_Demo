package com.shellway.test;

import com.shellway.domain.Account;
import com.shellway.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SpringContext.xml")
public class SpringTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test01(){
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

    }
}

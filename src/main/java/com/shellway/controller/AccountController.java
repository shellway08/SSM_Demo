package com.shellway.controller;

import com.shellway.domain.Account;
import com.shellway.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Account> all = accountService.findAll();
        modelAndView.addObject("list",all);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.save(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/findById")
    public String findById(Integer id, Model model){
        Account account = accountService.findById(id);
        model.addAttribute("account",account);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Account account){
        accountService.update(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids){
        accountService.delete(ids);
        return "redirect:/account/findAll";
    }
}

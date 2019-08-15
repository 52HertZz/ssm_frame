package com.hnisc.controller;

import com.hnisc.entity.Account;
import com.hnisc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lh141
 * 账户控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("web层：查询所有账户信息");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request,
                              HttpServletResponse response) throws IOException {
      accountService.saveAccount(account);
      response.sendRedirect(request.getContextPath()+"/account/findAll");
//        return;
    }
}

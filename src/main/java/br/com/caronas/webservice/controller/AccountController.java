package br.com.caronas.webservice.controller;

import br.com.caronas.webservice.model.Account;
import br.com.caronas.webservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/test")
    public Account test() {
        Account account = new Account();
        account.setId(new Long(1));
        account.setUsername("TESTE");
        return account;
    }

    @RequestMapping("/{id}")
    public Account accountById(@PathVariable("id") String id) {
        Account account = accountService.getAccountById(id);
        if (account == null) {
            account = new Account();
        }
        return account;
    }
}

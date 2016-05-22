package br.com.caronas.webservice.service;

import br.com.caronas.webservice.dao.AccountDAO;
import br.com.caronas.webservice.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {

    private AccountDAO accountDAO;

    @Autowired
    private void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account getAccountById(String id) {
        return accountDAO.getAccountById(id);
    }
}

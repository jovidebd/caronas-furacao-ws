package br.com.caronas.webservice.dao;


import br.com.caronas.webservice.model.Account;

public interface AccountDAO {
    Account getAccountById(Long id);
}

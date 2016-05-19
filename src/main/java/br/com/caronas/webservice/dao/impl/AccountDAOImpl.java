package br.com.caronas.webservice.dao.impl;


import br.com.caronas.webservice.dao.AbstractDAO;
import br.com.caronas.webservice.dao.AccountDAO;
import br.com.caronas.webservice.jdbc.AccountRowMapper;
import br.com.caronas.webservice.model.Account;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAOImpl extends AbstractDAO implements AccountDAO {

    @Override
    public Account getAccountById(Long id) {
        List<Account> accountList = new NamedParameterJdbcTemplate(this.getJdbcTemplate()).query("/* QUERY */", new AccountRowMapper());
        return accountList.get(0);
    }
}

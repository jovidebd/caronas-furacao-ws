package br.com.caronas.webservice.dao.impl;


import br.com.caronas.webservice.dao.AbstractDAO;
import br.com.caronas.webservice.dao.AccountDAO;
import br.com.caronas.webservice.jdbc.AccountRowMapper;
import br.com.caronas.webservice.model.Account;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class AccountDAOImpl extends AbstractDAO implements AccountDAO {

    private static final String SELECT_ACCOUNT_BY_ID = "SELECT"
    + "         *"
    + "     FROM"
    + "         account"
    + "     WHERE"
    + "         account_id = :id";

    @Override
    public Account getAccountById(String id) {
        try {

            HashMap<String, String> params = new HashMap<>();
            params.put("id", id);

            List<Account> accountList = new NamedParameterJdbcTemplate(this.getJdbcTemplate()).query(SELECT_ACCOUNT_BY_ID,
                    params,
                    new AccountRowMapper());

            return accountList.get(0);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

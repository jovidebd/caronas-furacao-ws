package br.com.caronas.webservice.jdbc;

import br.com.caronas.webservice.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();

        account.setId(resultSet.getLong("account_id"));
        account.setUsername(resultSet.getString("username"));
        account.setPassword(resultSet.getString("password"));
        return account;
    }
}

package br.com.caronas.webservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class AbstractDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("dataSource")
    private void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }
}

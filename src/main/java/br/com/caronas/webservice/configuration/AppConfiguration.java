package br.com.caronas.webservice.configuration;

import br.com.caronas.webservice.service.AccountService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "br.com.caronas.webservice.controller " +
        "br.com.caronas.webservice.dao " +
        "br.com.caronas.webservice.service")
public class AppConfiguration {

    @Bean
    @Qualifier("accountService")
    public AccountService getAccountService(){
        return new AccountService();
    }

}

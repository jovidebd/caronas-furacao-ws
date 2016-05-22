package br.com.caronas.webservice.context;


import org.springframework.context.ApplicationContext;

public class AppContext {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }

}

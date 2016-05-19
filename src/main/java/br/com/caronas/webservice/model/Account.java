package br.com.caronas.webservice.model;

public class Account {

    private final long id;
    private final String name;

    public Account(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

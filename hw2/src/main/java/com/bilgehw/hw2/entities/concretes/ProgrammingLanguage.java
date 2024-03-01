package com.bilgehw.hw2.entities.concretes;

public class ProgrammingLanguage {
    private Integer id;
    private String name;
    private String inventor;

    public ProgrammingLanguage(Integer id, String name, String inventor) {
        this.id = id;
        this.name = name;
        this.inventor = inventor;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}

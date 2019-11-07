package com.company;

public class Work {
    private String name;
    private String email;

    public Work() {

    }

    public Work(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String var(String a, String b) {
        return "Name, Email:" + getName() + getEmail();
    }

}


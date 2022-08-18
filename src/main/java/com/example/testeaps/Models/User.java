package com.example.testeaps.Models;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private int userId;
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;

    public User(String firstName, String lastName){
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getFirstName(){
        return this.firstName.getName();
    }

    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }

    public String getLastName(){
        return this.firstName.getName();
    }

    public void setLastName(String firstName){
        this.firstName.set(firstName);
    }
}

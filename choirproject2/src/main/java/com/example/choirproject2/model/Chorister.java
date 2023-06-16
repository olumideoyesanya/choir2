package com.example.choirproject2.model;

public class Chorister {
    private int choirId;
    private String FirstName;
    private String LastName;



    private String Email;
    private String Address;

    public Chorister() {
    }

    public Chorister(int choirId, String firstName, String lastName, String email, String address) {
        this.choirId = choirId;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Address = address;
    }


    public int getChoirId() {
        return choirId;
    }

    public void setChoirId(int choirId) {
        this.choirId = choirId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}

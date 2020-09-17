package com.example.contactmanagement;

public class Contact {
    String firstname, lastname, cellphone, workphone, email;

    public Contact(String firstname, String lastname, String cellphone, String workphone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.workphone = workphone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.example.contactmanagement;

public class Contact {
    String firstname, lastname, cellphone, workphone, email;
    boolean phoneDefault;

    /***
     *
     * @param firstname firstname
     * @param lastname lastname
     * @param cellphone cellphone
     * @param workphone workphone
     * @param email email address
     * @param phoneDefault true = cellphone, false = workphone
     */

    public Contact(String firstname, String lastname, String cellphone, String workphone, String email, boolean phoneDefault) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.workphone = workphone;
        this.email = email;
        this.phoneDefault = phoneDefault;
    }

    public boolean isPhoneDefault() {
        return phoneDefault;
    }

    public void setPhoneDefault(boolean phoneDefault) {
        this.phoneDefault = phoneDefault;
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

    public String getFullName(){
        return firstname + " " + lastname;
    }
}

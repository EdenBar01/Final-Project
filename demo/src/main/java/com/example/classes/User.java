package com.example.classes;


import com.example.abstracts.Aperson;
import com.example.enums.Admin;
import com.example.enums.Gender;

import java.io.Serializable;
import java.util.Date;

public class User extends Aperson implements Serializable {
    private String username;
    private String password;
    private Admin admin;
    private String department;

    public User(String person_id, String first_name, String last_name, Gender gender, String role, String qualifications, String phoneNumber, Date birth, String address, String contact_name, String contact_number, String disability, String username, String password, Admin admin, String department) {
        super(person_id, first_name, last_name, gender, role, qualifications, phoneNumber, birth, address, contact_name, contact_number, disability);
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.department = department;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}

package com.example.abstracts;

import com.example.enums.Gender;

import java.io.Serializable;
import java.util.Date;

public abstract class Aperson implements Serializable {

    private String person_id;
    private String first_name;
    private String last_name;
    private Gender gender;
    private String role;
    private String qualifications;
    private String phoneNumber;
    private Date birth;
    private String address;
    private String contact_name;
    private String contact_number;
    private String disability;

    public Aperson(String person_id, String first_name, String last_name, Gender gender, String role, String qualifications, String phoneNumber, Date birth, String address, String contact_name, String contact_number, String disability) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.role = role;
        this.qualifications = qualifications;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
        this.address = address;
        this.contact_name = contact_name;
        this.contact_number = contact_number;
        this.disability = disability;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }
}

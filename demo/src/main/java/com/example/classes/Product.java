package com.example.classes;

import java.io.Serializable;

public class Product implements Serializable {
    private String product_id;
    private String product_name;
    private String department;
    private String company;
    private String qualifications;
    private String details;

    public Product(String product_id, String product_name, String department, String company, String qualifications, String details) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.department = department;
        this.company = company;
        this.qualifications = qualifications;
        this.details = details;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

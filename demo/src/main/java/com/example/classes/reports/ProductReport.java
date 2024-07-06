package com.example.classes.reports;

import java.util.Date;
import java.util.HashMap;

import com.example.abstracts.Areport;

public class ProductReport extends Areport{
    private HashMap<Date, Integer> products;

    public ProductReport(String report_id, Date date, HashMap<Date, Integer> products) {
        super(report_id, date);
        this.products = products;
    }

    public HashMap<Date, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Date, Integer> products) {
        this.products = products;
    }
}

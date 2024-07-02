package com.example.abstracts;

import java.io.Serializable;
import java.util.Date;

public abstract class Areport implements Serializable {
    private String report_id;
    private Date date;

    public Areport(String report_id, Date date) {
        this.report_id = report_id;
        this.date = date;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

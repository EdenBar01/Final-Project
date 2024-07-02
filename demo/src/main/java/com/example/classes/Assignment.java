package com.example.classes;


import java.io.Serializable;
import java.util.Date;

public class Assignment implements Serializable {
    private String assignment_id;
    private Date date;
    private Integer number_of_hours;
    private Integer output;
    private Float hourly_avg;

    public Assignment(String assignment_id, Date date, Integer number_of_hours, Integer output, Float hourly_avg) {
        this.assignment_id = assignment_id;
        this.date = date;
        this.number_of_hours = number_of_hours;
        this.output = output;
        this.hourly_avg = hourly_avg;
    }

    public String getAssignment_id() {
        return this.assignment_id;
    }

    public void setAssignment_id(String assignment_id) {
        this.assignment_id = assignment_id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber_of_hours() {
        return this.number_of_hours;
    }

    public void setNumber_of_hours(Integer number_of_hours) {
        this.number_of_hours = number_of_hours;
    }

    public Integer getOutput() {
        return this.output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Float getHourly_avg() {
        return this.hourly_avg;
    }

    public void setHourly_avg(Float hourly_avg) {
        this.hourly_avg = hourly_avg;
    }


}

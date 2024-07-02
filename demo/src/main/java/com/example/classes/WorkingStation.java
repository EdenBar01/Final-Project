package com.example.classes;

import java.io.Serializable;
import java.util.Date;

public class WorkingStation implements Serializable {
    private String station_id;
    private Date date;
    private Integer number_of_hours;
    private Integer output;
    private Float hourly_avg;

    public WorkingStation(String station_id, Date date, Integer number_of_hours, Integer output, Float hourly_avg) {
        this.station_id = station_id;
        this.date = date;
        this.number_of_hours = number_of_hours;
        this.output = output;
        this.hourly_avg = hourly_avg;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber_of_hours() {
        return number_of_hours;
    }

    public void setNumber_of_hours(Integer number_of_hours) {
        this.number_of_hours = number_of_hours;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Float getHourly_avg() {
        return hourly_avg;
    }

    public void setHourly_avg(Float hourly_avg) {
        this.hourly_avg = hourly_avg;
    }
}

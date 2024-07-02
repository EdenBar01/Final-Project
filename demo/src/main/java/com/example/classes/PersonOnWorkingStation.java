package com.example.classes;


import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class PersonOnWorkingStation implements Serializable {
    private String person_id;
    private String station_id;
    private Integer actual_execution;
    private HashMap<Date, Integer> map_per_date;
    private Float daily_avg_output;

    public PersonOnWorkingStation(String person_id, String station_id, Integer actual_execution, HashMap<Date, Integer> map_per_date, Float daily_avg_output) {
        this.person_id = person_id;
        this.station_id = station_id;
        this.actual_execution = actual_execution;
        this.map_per_date = map_per_date;
        this.daily_avg_output = daily_avg_output;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public Integer getActual_execution() {
        return actual_execution;
    }

    public void setActual_execution(Integer actual_execution) {
        this.actual_execution = actual_execution;
    }

    public HashMap<Date, Integer> getMap_per_date() {
        return map_per_date;
    }

    public void setMap_per_date(HashMap<Date, Integer> map_per_date) {
        this.map_per_date = map_per_date;
    }

    public Float getDaily_avg_output() {
        return daily_avg_output;
    }

    public void setDaily_avg_output(Float daily_avg_output) {
        this.daily_avg_output = daily_avg_output;
    }
}


package com.example.classes.reports;

import com.example.abstracts.Aperson;
import com.example.abstracts.Areport;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class WorkingStationReport extends Areport implements Serializable {
    private HashMap<Aperson, Integer> stations;

    public WorkingStationReport(String report_id, Date date, HashMap<Aperson, Integer> stations) {
        super(report_id, date);
        this.stations = stations;
    }

    public HashMap<Aperson, Integer> getStations() {
        return stations;
    }

    public void setStations(HashMap<Aperson, Integer> stations) {
        this.stations = stations;
    }
}

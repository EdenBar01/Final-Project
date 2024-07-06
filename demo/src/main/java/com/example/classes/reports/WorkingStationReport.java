package com.example.classes.reports;

import java.util.Date;
import java.util.HashMap;

import com.example.abstracts.Aperson;
import com.example.abstracts.Areport;

public class WorkingStationReport extends Areport {
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

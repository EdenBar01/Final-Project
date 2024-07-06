package com.example.classes.reports;

import java.util.Date;
import java.util.List;

import com.example.abstracts.Areport;
import com.example.classes.PersonOnWorkingStation;

public class WorkerReport extends Areport{
    private List<PersonOnWorkingStation> personOnWorkingStationList;

    public WorkerReport(String report_id, Date date, List<PersonOnWorkingStation> personOnWorkingStationList) {
        super(report_id, date);
        this.personOnWorkingStationList = personOnWorkingStationList;
    }

    public List<PersonOnWorkingStation> getPersonOnWorkingStationList() {
        return personOnWorkingStationList;
    }

    public void setPersonOnWorkingStationList(List<PersonOnWorkingStation> personOnWorkingStationList) {
        this.personOnWorkingStationList = personOnWorkingStationList;
    }
}

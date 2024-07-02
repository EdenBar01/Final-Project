package com.example.classes.reports;

import com.example.abstracts.Areport;
import com.example.classes.PersonOnWorkingStation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WorkerReport extends Areport implements Serializable {
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

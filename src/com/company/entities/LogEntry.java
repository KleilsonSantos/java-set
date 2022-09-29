package com.company.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String userNAme;
    private Date moment;

    public LogEntry(){
    }

    public LogEntry(String userNAme, Date moment) {
        this.userNAme = userNAme;
        this.moment = moment;
    }

    public String getUserNAme() {
        return userNAme;
    }

    public void setUserNAme(String userNAme) {
        this.userNAme = userNAme;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry)) return false;
        LogEntry logs = (LogEntry) o;
        return Objects.equals(getUserNAme(), logs.getUserNAme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserNAme());
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return userNAme + " " + moment+ "\n";
    }
}

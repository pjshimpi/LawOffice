package org.solvd.lawofficeapp.meeting;
import org.solvd.lawofficeapp.lawyer.Lawyer;
import org.solvd.lawofficeapp.legalcase.LegalCase;

import java.time.LocalDateTime;

public class Meeting {
    private LocalDateTime dateTime;
    private String location;
    private LegalCase meetingCase;
    private Lawyer responsibleLawyer;

    public Meeting(LocalDateTime dateTime, String location, LegalCase meetingCase, Lawyer responsibleLawyer) {
        this.dateTime = dateTime;
        this.location = location;
        this.meetingCase = meetingCase;
        this.responsibleLawyer = responsibleLawyer;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LegalCase getMeetingCase() {
        return meetingCase;
    }

    public void setMeetingCase(LegalCase meetingCase) {
        this.meetingCase = meetingCase;
    }

    public Lawyer getResponsibleLawyer() {
        return responsibleLawyer;
    }

    public void setResponsibleLawyer(Lawyer responsibleLawyer) {
        this.responsibleLawyer = responsibleLawyer;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "dateTime=" + dateTime +
                ", location='" + location + '\'' +
                ", meetingCase=" + meetingCase +
                ", responsibleLawyer=" + responsibleLawyer +
                '}';
    }
}

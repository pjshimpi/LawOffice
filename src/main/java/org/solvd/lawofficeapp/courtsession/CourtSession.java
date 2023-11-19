package org.solvd.lawofficeapp.courtsession;
import org.solvd.lawofficeapp.court.Court;
import org.solvd.lawofficeapp.legalcase.LegalCase;

import java.time.LocalDateTime;
import java.util.List;

public class CourtSession {
    private LocalDateTime dateTime;
    private Court court;
    private List<LegalCase> cases;

    public CourtSession(LocalDateTime dateTime, Court court, List<LegalCase> cases) {
        this.dateTime = dateTime;
        this.court = court;
        this.cases = cases;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public List<LegalCase> getCases() {
        return cases;
    }

    public void setCases(List<LegalCase> cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "CourtSession{" +
                "dateTime=" + dateTime +
                ", court=" + court +
                ", cases=" + cases +
                '}';
    }
}

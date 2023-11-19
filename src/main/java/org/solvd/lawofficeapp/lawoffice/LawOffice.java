package org.solvd.lawofficeapp.lawoffice;

import org.solvd.lawofficeapp.client.Client;
import org.solvd.lawofficeapp.court.Court;
import org.solvd.lawofficeapp.courtsession.CourtSession;
import org.solvd.lawofficeapp.lawdocument.LawDocument;
import org.solvd.lawofficeapp.lawyer.Lawyer;
import org.solvd.lawofficeapp.legalcase.LegalCase;
import org.solvd.lawofficeapp.meeting.Meeting;

import java.util.ArrayList;
import java.util.List;

public class LawOffice {
    private List<Lawyer> lawyers;
    private List<Client> clients;
    private List<LegalCase> cases;
    private List<Meeting> meetings;
    private List<LawDocument> documents;
    private List<Court> courts;
    private List<CourtSession> courtSessions;

    public LawOffice() {
        this.lawyers = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.cases = new ArrayList<>();
        this.meetings = new ArrayList<>();
        this.documents = new ArrayList<>();
        this.courts = new ArrayList<>();
        this.courtSessions = new ArrayList<>();
    }

    public void addLawyer(Lawyer lawyer) {
        lawyers.add(lawyer);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addCase(LegalCase legalCase) {
        cases.add(legalCase);
    }

    public void scheduleMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void addDocument(LawDocument document) {
        documents.add(document);
    }

    public void addCourt(Court court) {
        courts.add(court);
    }

    public void scheduleCourtSession(CourtSession courtSession) {
        courtSessions.add(courtSession);
    }

    // Getters for various entities

    public List<Lawyer> getLawyers() {
        return lawyers;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<LegalCase> getCases() {
        return cases;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public List<LawDocument> getDocuments() {
        return documents;
    }

    public List<Court> getCourts() {
        return courts;
    }

    public List<CourtSession> getCourtSessions() {
        return courtSessions;
    }

    @Override
    public String toString() {
        return "LawOffice{" +
                "lawyers=" + lawyers +
                ", clients=" + clients +
                ", cases=" + cases +
                ", meetings=" + meetings +
                ", documents=" + documents +
                ", courts=" + courts +
                ", courtSessions=" + courtSessions +
                '}';
    }
}

package org.solvd.lawofficeapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.solvd.lawofficeapp.client.Client;
import org.solvd.lawofficeapp.court.Court;
import org.solvd.lawofficeapp.courtsession.CourtSession;
import org.solvd.lawofficeapp.lawdocument.LawDocument;
import org.solvd.lawofficeapp.lawoffice.LawOffice;
import org.solvd.lawofficeapp.lawyer.Lawyer;
import org.solvd.lawofficeapp.legalcase.LegalCase;
import org.solvd.lawofficeapp.meeting.Meeting;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger LOGGER = LogManager.getLogger(Main.class);
        // Create a law office
        LawOffice lawOffice = new LawOffice();

        // Create clients
        Client client1 = new Client("John Doe", "123 Main St");
        Client client2 = new Client("Jane Smith", "456 Oak Ave");

        // Create lawyers
        Lawyer lawyer1 = new Lawyer("Alice Attorney", "Criminal Law");
        Lawyer lawyer2 = new Lawyer("Bob Barrister", "Family Law");

        // Create cases
        LegalCase case1 = new LegalCase(1, "Theft case", client1);
        LegalCase case2 = new LegalCase(2, "Divorce case", client2);

        // Create meetings
        Meeting meeting1 = new Meeting(LocalDateTime.now(), "Law LawOffice", case1, lawyer1);
        Meeting meeting2 = new Meeting(LocalDateTime.now().plusDays(1), "Courthouse", case2, lawyer2);

        // Create documents
        LawDocument document1 = new LawDocument(1, "Evidence Document", "This document contains crucial evidence", case1);
        LawDocument document2 = new LawDocument(2, "Divorce Agreement", "This document outlines the terms of the divorce", case2);

        // Create courts
        Court court1 = new Court("City Court", "123 City Ave");
        Court court2 = new Court("Family Court", "789 Family St");

        // Create court sessions
        CourtSession courtSession1 = new CourtSession(LocalDateTime.now().plusDays(2), court1, List.of(case1));
        CourtSession courtSession2 = new CourtSession(LocalDateTime.now().plusDays(3), court2, List.of(case2));

        // Add data to the law office
        lawOffice.addLawyer(lawyer1);
        lawOffice.addLawyer(lawyer2);
        lawOffice.addClient(client1);
        lawOffice.addClient(client2);
        lawOffice.addCase(case1);
        lawOffice.addCase(case2);
        lawOffice.scheduleMeeting(meeting1);
        lawOffice.scheduleMeeting(meeting2);
        lawOffice.addDocument(document1);
        lawOffice.addDocument(document2);
        lawOffice.scheduleCourtSession(courtSession1);
        lawOffice.scheduleCourtSession(courtSession2);

        // Display information (for demonstration purposes)
        LOGGER.info("Lawyers in the Law LawOffice:");
        lawOffice.getLawyers().forEach(System.out::println);

        LOGGER.info("\nClients in the Law LawOffice:");
        lawOffice.getClients().forEach(System.out::println);

        LOGGER.info("\nCases in the Law LawOffice:");
        lawOffice.getCases().forEach(System.out::println);

        LOGGER.info("\nMeetings in the Law LawOffice:");
        lawOffice.getMeetings().forEach(System.out::println);

        LOGGER.info("\nDocuments in the Law LawOffice:");
        lawOffice.getDocuments().forEach(System.out::println);

        LOGGER.info("\nCourts in the Law LawOffice:");
        lawOffice.getCourts().forEach(System.out::println);

        LOGGER.info("\nCourt Sessions in the Law LawOffice:");
        lawOffice.getCourtSessions().forEach(System.out::println);
    }
}


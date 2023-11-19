package org.solvd.lawofficeapp.legalcase;

import org.solvd.lawofficeapp.client.Client;

public class LegalCase {
    private int caseNumber;
    private String description;
    private Client client;

    public LegalCase(int caseNumber, String description, Client client) {
        this.caseNumber = caseNumber;
        this.description = description;
        this.client = client;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "LegalCase{" +
                "caseNumber=" + caseNumber +
                ", description='" + description + '\'' +
                ", client=" + client +
                '}';
    }
}

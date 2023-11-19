package org.solvd.lawofficeapp.lawdocument;

import org.solvd.lawofficeapp.legalcase.LegalCase;

public class LawDocument {
    private int documentId;
    private String title;
    private String content;
    private LegalCase relatedCase;

    public LawDocument(int documentId, String title, String content, LegalCase relatedCase) {
        this.documentId = documentId;
        this.title = title;
        this.content = content;
        this.relatedCase = relatedCase;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LegalCase getRelatedCase() {
        return relatedCase;
    }

    public void setRelatedCase(LegalCase relatedCase) {
        this.relatedCase = relatedCase;
    }

    @Override
    public String toString() {
        return "LawDocument{" +
                "documentId=" + documentId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", relatedCase=" + relatedCase +
                '}';
    }
}

package com.genspark.qa;

public class Defect {

    private String id;
    private String title;
    private String severity;
    private String status;

    public Defect(String id, String title, String severity, String status) {
        this.id = id;
        this.title = title;
        this.severity = severity;
        this.status = status;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getSeverity() { return severity; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return id + " | " + title + " | " + severity + " | " + status;
    }
}
package com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared;


import java.io.Serializable;

public abstract class Charakter implements Serializable {

    private String vorname;
    private String nachname;
    private String pictureUrl;

    private String description;

    public Charakter() {}

    public Charakter(String vorname, String nachname, String description, String pictureUrl) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setDescription(description);
        this.setPictureUrl(pictureUrl);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String faceUrl) {
        this.pictureUrl = faceUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return String.format("Charakter: Vorname: %s\nNachname: %s\nDescription:%s", this.vorname, this.nachname, this.description);
    }
}

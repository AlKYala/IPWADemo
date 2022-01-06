package com.example.ipwademo.IPWA1.Kapitel5.Thema2.Builders;

import com.example.ipwademo.IPWA1.Kapitel5.Thema2.CustomCharacter;

public class CharacterBuilder {

    private String vorname;
    private String nachname;
    private String description;
    private String picUrl;

    public CustomCharacter getCharacter() {

        if(this.vorname == null || this.nachname == null || this.description == null || this.picUrl == null) {
            throw new CharacterException("Please specify ALL fields before building");
        }

        CustomCharacter customCharacter = new CustomCharacter();
        customCharacter.setVorname(this.getVorname());
        customCharacter.setNachname(this.getNachname());
        customCharacter.setDescription(this.getDescription());
        customCharacter.setPictureUrl(this.getPicUrl());

        return customCharacter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getDescription() {
        return description;
    }

    public String getPicUrl() {
        return picUrl;
    }
}

/**
 * mir war lw
 */
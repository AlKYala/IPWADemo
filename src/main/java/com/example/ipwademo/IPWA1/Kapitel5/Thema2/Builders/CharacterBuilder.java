package com.example.ipwademo.IPWA1.Kapitel5.Thema2.Builders;

import com.example.ipwademo.IPWA1.Kapitel5.Thema2.CharacterException;
import com.example.ipwademo.IPWA1.Kapitel5.Thema2.CustomCharacter;

public class CharacterBuilder {

    private String vorname;
    private String nachname;
    private String description;
    private String picUrl;

    private static CharacterBuilder nishikiBuilder;
    private static CharacterBuilder ryujiBuilder;
    private static CharacterBuilder mineBuilder;

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

    //prebuilt builders because I'm too lazy to make them seperate factories

    public static CharacterBuilder getNishikiBuilder() {
        if(CharacterBuilder.nishikiBuilder == null) {
            CharacterBuilder.nishikiBuilder = new CharacterBuilder();
            CharacterBuilder.nishikiBuilder.setVorname("Akira");
            CharacterBuilder.nishikiBuilder.setNachname("Nishikiyama");
            CharacterBuilder.nishikiBuilder.setDescription("Freund aus Kindertagen und Schwurbruder des Hauptcharkters. Opfert sein Leben fuer seinen Bruder.");
            CharacterBuilder.nishikiBuilder.setPicUrl("https://tenor.com/view/yakuza-yakuza-kiwami-nishiki-nishikiyama-gif-22470448");
        }
        return CharacterBuilder.nishikiBuilder;
    }

    public static CharacterBuilder getRyujiBuilder() {
        if(CharacterBuilder.ryujiBuilder == null) {
            CharacterBuilder.ryujiBuilder = new CharacterBuilder();
            CharacterBuilder.ryujiBuilder.setVorname("Goda");
            CharacterBuilder.ryujiBuilder.setNachname("Ryuji");
            CharacterBuilder.ryujiBuilder.setDescription("Gebräunter blonder Japaner. Wollte dem Hauptcharakter aufs Maul hauen, einfach nur darum.");
            CharacterBuilder.ryujiBuilder.setPicUrl("https://i.imgur.com/V5YECGD.gif");
        }
        return CharacterBuilder.ryujiBuilder;
    }

    public static CharacterBuilder getMineBuilder() {
        if(CharacterBuilder.mineBuilder == null) {
            CharacterBuilder.mineBuilder = new CharacterBuilder();
            CharacterBuilder.mineBuilder.setVorname("Yoshitaka");
            CharacterBuilder.mineBuilder.setNachname("Mine");
            CharacterBuilder.mineBuilder.setDescription("Herro. No. There is change in the pran.");
            CharacterBuilder.mineBuilder.setPicUrl("https://tenor.com/view/yakuza-ryu-ga-gotoku-yakuza3-yoshitaka-mine-mine-gif-24035554");
        }
        return CharacterBuilder.mineBuilder;
    }
}

/**
 * mir war lw
 */
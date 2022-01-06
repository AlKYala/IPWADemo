package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans.RequestCharacter;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;
import com.example.ipwademo.IPWA1.Kapitel5.Thema2.Builders.CharacterBuilder;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class Bosses {

    private List<Character> mitglieder;
    private static Bosses family;

    private Bosses() {
        this.mitglieder = new ArrayList<Character>();
        this.initData();
    }

    private void initData() {
        this.mitglieder.add(CharacterBuilder.getNishikiBuilder().getCharacter());
        this.mitglieder.add(CharacterBuilder.getRyujiBuilder().getCharacter());
        this.mitglieder.add(CharacterBuilder.getMineBuilder().getCharacter());
    }

}


/**
 * Dies ist ein Singleton - Application Scoped
 * Nach Singleton pattern - ein getInstance-Methode und Konstruktor private gesetzt damits nur eine
 * Instanz per Laufzeit gibt
 *
 * Wir bedienen uns an den Klassen die wir fuer das erste Thema geschrieben haben
 */
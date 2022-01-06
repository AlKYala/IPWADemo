package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;
import com.example.ipwademo.IPWA1.Kapitel5.Thema2.Builders.CharacterBuilder;
import com.example.ipwademo.IPWA1.Kapitel5.Thema2.Builders.CharacterException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class BossService {

    private List<Character> mitglieder;
    private static BossService instance;

    //falls ich sie mehr als 1x brauche
    private CharacterBuilder nishikiBuilder;
    private CharacterBuilder ryujiBuilder;
    private CharacterBuilder mineBuilder;

    private BossService() {
        this.mitglieder = new ArrayList<Character>();
        this.initData();
    }

    public BossService getInstance() {
        if(instance == null) {
            BossService.instance = new BossService();
        }
        return BossService.instance;
    }

    private void initData() {
        this.mitglieder.add(this.nishikiBuilder.getCharacter());
        this.mitglieder.add(this.ryujiBuilder.getCharacter());
        this.mitglieder.add(this.mineBuilder.getCharacter());
    }

    public void addNishikiInstance() {
        this.mitglieder.add(this.nishikiBuilder.getCharacter());
    }

    public void addRyujiInstance() {
        this.mitglieder.add(this.ryujiBuilder.getCharacter());
    }

    public void addMineInstance() {
        this.mitglieder.add(this.mineBuilder.getCharacter());
    }

    public void addCustomInstance() {
        //TODO
    }

    public void remove(int i) {
        if(this.mitglieder == null || this.mitglieder.isEmpty()) {
            throw new CharacterException("Es gibt keine Mitglieder zum loeschen");
        }
        try {
            this.mitglieder.remove(i);
        } catch (IndexOutOfBoundsException e) {
            i = (i >= this.mitglieder.size()) ? this.mitglieder.size()-1 : 0;
            this.mitglieder.remove(i);
        }
    }

    private void initBuilders() {
        this.initNishikiBuilder();
        this.initRyujiBuilder();
        this.initMineBuilder();
    }

    private void initNishikiBuilder() {
        this.nishikiBuilder = new CharacterBuilder();
        this.nishikiBuilder.setVorname("Akira");
        this.nishikiBuilder.setNachname("Nishikiyama");
        this.nishikiBuilder.setDescription("Freund aus Kindertagen und Schwurbruder des Hauptcharkters. Opfert sein Leben fuer seinen Bruder.");
        this.nishikiBuilder.setPicUrl("https://tenor.com/view/yakuza-yakuza-kiwami-nishiki-nishikiyama-gif-22470448");
    }

    private void initRyujiBuilder() {
        this.ryujiBuilder = new CharacterBuilder();
        this.ryujiBuilder.setVorname("Goda");
        this.ryujiBuilder.setNachname("Ryuji");
        this.ryujiBuilder.setDescription("Gebräunter blonder Japaner. Wollte dem Hauptcharakter aufs Maul hauen, einfach nur darum.");
        this.ryujiBuilder.setPicUrl("https://i.imgur.com/V5YECGD.gif");
    }

    private void initMineBuilder() {
        this.mineBuilder = new CharacterBuilder();
        this.mineBuilder.setVorname("Yoshitaka");
        this.mineBuilder.setNachname("Mine");
        this.mineBuilder.setDescription("Herro. No. There is change in the pran.");
        this.mineBuilder.setPicUrl("https://tenor.com/view/yakuza-ryu-ga-gotoku-yakuza3-yoshitaka-mine-mine-gif-24035554");
    }
}


/**
 * Dies ist ein Singleton - Application Scoped
 * Nach Singleton pattern - ein getInstance-Methode und Konstruktor private gesetzt damits nur eine
 * Instanz per Laufzeit gibt
 *
 * Wir bedienen uns an den Klassen die wir fuer das erste Thema geschrieben haben
 */
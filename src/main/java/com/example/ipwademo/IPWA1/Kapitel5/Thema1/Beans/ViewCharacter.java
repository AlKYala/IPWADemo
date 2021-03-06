package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ViewCharacter extends Charakter {

    public ViewCharacter() {
        this.setVorname("David");
        this.setNachname("Hasselhoff");
        this.setDescription("Ein Mann.");
        this.setPictureUrl("https://www.bz-berlin.de/data/uploads/2021/01/dpa_5fa4480086ca5a54_1611479987-768x432.jpg");
    }

    public ViewCharacter(String vorname, String nachname, String description, String pictureUrl) {
        super(vorname, nachname, description, pictureUrl);
    }

}

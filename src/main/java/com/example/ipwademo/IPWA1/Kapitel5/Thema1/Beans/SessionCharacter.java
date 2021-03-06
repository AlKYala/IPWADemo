package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;


@ManagedBean
@SessionScoped
public class SessionCharacter extends Charakter {

    public SessionCharacter() {
        this.setVorname("Monki");
        this.setNachname("Flip");
        this.setDescription("OH OH AH AH");
        this.setPictureUrl("https://c.tenor.com/7kzP_bmlzccAAAAM/monkiflip-monki.gif");
    }

    public SessionCharacter(String vorname, String nachname, String description, String pictureUrl) {
        super(vorname, nachname, description, pictureUrl);
    }
}

/*
"Monki"
"Flip"
""OH OH AH AH""
"https://c.tenor.com/7kzP_bmlzccAAAAM/monkiflip-monki.gif"
 */
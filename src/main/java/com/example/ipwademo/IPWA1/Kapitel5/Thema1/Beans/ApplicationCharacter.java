package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.Character;

@ManagedBean(name = "appCharacter")
@ApplicationScoped
public class ApplicationCharacter extends Character {

    public ApplicationCharacter(String vorname, String nachname, String pictureUrl, String description) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setPictureUrl(pictureUrl);
        this.setDescription(description);
    }

}

/*
By Default
"Kazuma"
"Kiryu"
"https://cdn.mos.cms.futurecdn.net/N3ukr4EHcFAjmQLtcUrnQR-480-80.jpg"
"Ein 50 Jahre alter Japaner der jede Mafia in Asien mehrmals verkloppt hat."
 */

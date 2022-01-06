package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

@ManagedBean(name = "appCharacter")
@ApplicationScoped
public class ApplicationCharacter extends Character {

    public ApplicationCharacter() {
        this.setVorname("Kazuma");
        this.setNachname("Kiryu");
        this.setPictureUrl("https://cdn.mos.cms.futurecdn.net/N3ukr4EHcFAjmQLtcUrnQR-480-80.jpg");
        this.setDescription("Ein 50 Jahre alter Japaner der jede Mafia in Asien mehrmals verkloppt hat.");
    }

}

/*
By Default
"Kazuma"
"Kiryu"
"https://cdn.mos.cms.futurecdn.net/N3ukr4EHcFAjmQLtcUrnQR-480-80.jpg"
"Ein 50 Jahre alter Japaner der jede Mafia in Asien mehrmals verkloppt hat."
 */

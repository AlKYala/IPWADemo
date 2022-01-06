package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.Character;


@RequestScoped
@ManagedBean(name = "reqCharacter")
public class RequestCharacter extends Character {
    public RequestCharacter() {
        this.setVorname("Knight Industries");
        this.setNachname("Two Thousand");
        this.setDescription("Ein Auto.\nEinComputer.");
        this.setPictureUrl("https://cdn1.vogel.de/unsafe/800x0/smart/images.vogel.de/vogelonline/bdb/1783000/1783059/original.jpg");
    }
}

/*
 * "Knight Industries"
 * "Two Thousand"
 * "Ein Auto.\nEinComputer."
 * "https://cdn1.vogel.de/unsafe/800x0/smart/images.vogel.de/vogelonline/bdb/1783000/1783059/original.jpg"
 */
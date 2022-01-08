package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;


@RequestScoped
@ManagedBean(name = "reqCharacter")
public class RequestCharacter extends Charakter {

    public RequestCharacter() {}

    public RequestCharacter(String vorname, String nachname, String description, String pictureUrl) {
        super(vorname, nachname, description, pictureUrl);
    }
}

/*
 * "Knight Industries"
 * "Two Thousand"
 * "Ein Auto.\nEinComputer."
 * "https://cdn1.vogel.de/unsafe/800x0/smart/images.vogel.de/vogelonline/bdb/1783000/1783059/original.jpg"
 */
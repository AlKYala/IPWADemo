package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ViewCharacter extends Charakter {

    public ViewCharacter() {}

    public ViewCharacter(String vorname, String nachname, String description, String pictureUrl) {
        super(vorname, nachname, description, pictureUrl);
    }

}

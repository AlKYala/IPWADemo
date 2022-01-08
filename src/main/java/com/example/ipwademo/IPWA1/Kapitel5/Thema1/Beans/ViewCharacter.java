package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ViewCharacter extends Character {

    public ViewCharacter() {}

    public ViewCharacter(String vorname, String nachname, String description, String pictureUrl) {
        super(vorname, nachname, description, pictureUrl);
    }

}

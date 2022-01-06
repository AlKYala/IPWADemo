package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "character")
public class CustomCharacter extends Character {
    @Override
    public CustomCharacter clone() {
        CustomCharacter customCharacter = new CustomCharacter();
        customCharacter.setVorname(this.getVorname());
        customCharacter.setNachname(this.getNachname());
        customCharacter.setDescription(this.getDescription());
        customCharacter.setPictureUrl(this.getPictureUrl());
        return customCharacter;
    }

    public String toString() {
        return String.format("V: %s\nN: %s\nD: %s\nI: %s", this.getVorname(), this.getNachname(), this.getDescription(), this.getPictureUrl());
    }
}

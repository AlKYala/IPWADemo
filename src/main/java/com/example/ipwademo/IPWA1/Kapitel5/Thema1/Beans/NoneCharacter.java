package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@NoneScoped
@ManagedBean(name = "noCharacter")
public class NoneCharacter extends Character {

    public NoneCharacter() {
        this.setVorname("John");
        this.setNachname("McAfee");
        this.setDescription("Der wahrscheinlich laessigste Computer-Nerd der jemals gelebt hat. #whackd");
        this.setPictureUrl("https://img.br.de/9353731c-80dc-43c9-baaf-b4b94b08f83b.jpeg?q=80&rect=314,221,2904,1633");
    }
}

/*
"John"
"McAfee"
"Der wahrscheinlich laessigste Computer-Nerd der jemals gelebt hat. #whackd"
"https://img.br.de/9353731c-80dc-43c9-baaf-b4b94b08f83b.jpeg?q=80&rect=314,221,2904,1633"
 */
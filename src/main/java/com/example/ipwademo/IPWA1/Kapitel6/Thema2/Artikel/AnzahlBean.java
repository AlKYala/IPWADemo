package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;


//es geht im Grunde nur darum, instanzen fuer Warenkoerbe zu erzeugen

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AnzahlBean {

    private Double anzahl = Double.valueOf(0);

    public double getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(Double number) {
        this.anzahl = number;
    }

    public void clear() {
        this.setAnzahl(Double.valueOf(0));
    }
}

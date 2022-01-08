package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;

@RequestScoped
@ManagedBean
public class Artikel {

    private int nr;
    private String name;
    private String text;
    private String bild;
    private int preisEuro;
    private int preisCent;
    private Date verfuegbarAb;

    public Artikel() {};

    public Artikel(int nr, String name, String text, String bild, Date verfuegbarAb, int preisEuro, int preisCent) {
        this.setNr(nr);
        this.setName(name);
        this.setText(text);
        this.setBild(bild);
        this.setVerfuegbarAb(verfuegbarAb);
        this.setPreisEuro(preisEuro);
        this.setPreisCent(preisCent);
    }

    public Artikel(int nr, String name, String text, String bild, int preisEuro, int preisCent) {
        this(nr, name, text, bild, new Date(), preisEuro, preisCent);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public Date getVerfuegbarAb() {
        return verfuegbarAb;
    }

    public void setVerfuegbarAb(Date verfuegbarAb) {
        this.verfuegbarAb = verfuegbarAb;
    }

    public int getPreisEuro() {
        return preisEuro;
    }

    public void setPreisEuro(int preisEuro) {
        this.preisEuro = preisEuro;
    }

    public int getPreisCent() {
        return preisCent;
    }

    public void setPreisCent(int preisCent) {
        int euros = preisCent % 100;
        this.preisCent = (preisCent - (euros * 100));
    }
}

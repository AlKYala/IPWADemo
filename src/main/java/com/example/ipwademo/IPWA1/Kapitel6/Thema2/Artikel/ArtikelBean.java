package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ViewScoped
@ManagedBean
public class ArtikelBean {

    private String name;
    private String text;
    private String bild;
    private int preisEuroList;
    private int preisCentList;
    private Date verfuegbarAb;

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

    public int getPreisEuroList() {
        return preisEuroList;
    }

    public void setPreisEuroList(int preisEuroList) {
        this.preisEuroList = preisEuroList;
    }

    public int getPreisCentList() {
        return preisCentList;
    }

    public void setPreisCentList(int preisCentList) {
        this.preisCentList = preisCentList;
    }

    public Date getVerfuegbarAb() {
        return verfuegbarAb;
    }

    public void setVerfuegbarAb(Date verfuegbarAb) {
        this.verfuegbarAb = verfuegbarAb;
    }

    public Artikel getAsArtikel() {
        //id set in shop
        return new Artikel(-1, this.getName(), this.getText(), this.getBild(),
                this.getVerfuegbarAb(), this.preisEuroList, this.preisCentList);
    }
}

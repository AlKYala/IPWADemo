package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;

@RequestScoped
@ManagedBean
public class Artikel {

    private int id;
    private String name;
    private String text;
    private String bild;
    private int preisEuro;
    private int preisCent;
    private Date verfuegbarAb;

    public Artikel() {};

    public Artikel(int id, String name, String text, String bild, Date verfuegbarAb, int preisEuro, int preisCent) {
        this.setId(id);
        this.setName(name);
        this.setText(text);
        this.setBild(bild);
        this.setVerfuegbarAb(verfuegbarAb);
        this.setPreisEuro(preisEuro);
        this.setPreisCent(preisCent);
    }

    public Artikel(int id, String name, String text, String bild, int preisEuro, int preisCent) {
        this(id, name, text, bild, new Date(), preisEuro, preisCent);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.preisEuro += euros;
        this.preisCent = (preisCent - (euros * 100));
    }

    public String getFormattedPrice() {
        String cents = (this.getPreisCent() < 10)
                ? String.format("0%d", this.getPreisCent())
                : Integer.toString(this.getPreisCent());
        return String.format("%d.%s€", this.getPreisEuro(), cents);
    }
}

package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

public class WarenkorbItem {

    private Artikel artikel;
    private int anzahl;

    public WarenkorbItem() {}

    public WarenkorbItem(Artikel artikel, int anzahl) {
        this.setAnzahl(anzahl);

    }

    public Artikel getArtikel() {
        return this.artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}

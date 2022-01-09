package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class Shop {

    private List<Artikel> artikelList;

    private int assignId;

    public Shop() {
        this.initData();
        this.assignId = 0;
    }

    private void initData() {
        artikelList = new ArrayList<Artikel>();

        this.addArtikel(new Artikel(0,
                "Bleu de Chanel 50ml EDT",
                "Nur einmal benutzt",
                "https://i.imgur.com/QAQwRdE.jpeg", 85, 0));

        this.addArtikel(new Artikel(1,
                "Gary SpongeBob Squarepants",
                "Gary SpongeBob Squarepants - das Original",
                "https://fimgs.net/mdimg/perfume/375x500.28291.jpg",
                new Date(122, 01, 01), 100, 0));

        this.addArtikel(new Artikel(2,
                "Creed: Virgin Island Water: 100ml",
                "Es riecht echt gut. Fuer Maenner und Frauen",
                "https://fimgs.net/mdimg/perfume/375x500.899.jpg",
                new Date(122, 00, 15), 235, 0));

        this.addArtikel(new Artikel(3,
                                    "Ralph Lauren: Polo Sport",
                                    "Es riecht nach fitti",
                                    "https://fimgs.net/mdimg/perfume/375x500.894.jpg",
                                        new Date(122, 0, 0), 52, 99));

        this.addArtikel(new Artikel(4,
                                    "Nishane: EGE / AIGAIO: 50ml EDP",
                                    "Ein Duft, den sich kein Normalo in Griechenland geschweige denn in der Tuerkei leisten kann.",
                                    "https://fimgs.net/mdimg/perfume/375x500.64092.jpg", 149,99));

        this.addArtikel(new Artikel(5,
                                    "Aramis: Aramis",
                                    "Man fragt sich: Riecht es nach Altenheim oder das Altenheim hiernach?",
                                        "https://fimgs.net/mdimg/perfume/375x500.113.jpg", 29,99));

        this.addArtikel(new Artikel(6,
                                    "JPG: Le Male",
                                    "Aus der Kategorie: Wenn du einen Duft fuer den Rest deines Lebens tragen muesstest dann diesen",
                                    "https://fimgs.net/mdimg/perfume/375x500.430.jpg", new Date(122,0,15), 49,99));

        this.addArtikel(new Artikel(7,
                                    "Joop! Hoome", "Ein Duft den jeder und sein Pap kennt,",
                                "https://fimgs.net/mdimg/perfume/375x500.1251.jpg", 29, 99));

        this.addArtikel(new Artikel(8,
                                    "Emporio Armani: Stronger with you Absolutely",
                                    "Der Beweis, dass Rum nach Pussy Magnet riechen kann",
                                    "https://fimgs.net/mdimg/perfume/375x500.64501.jpg",
                                    new Date(122, 1, 0), 59 ,99));
    }

    public List<Artikel> getArtikelList() {
        return artikelList;
    }

    public void setArtikelList(List<Artikel> artikelList) {
        this.artikelList = artikelList;
    }

    public void addArtikel(Artikel artikel) {
        artikel.setId(this.assignId);
        this.assignId++;
        this.artikelList.add(artikel);
    }
}

package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.math.BigDecimal;
import java.util.*;

@SessionScoped
@ManagedBean(name = "warenkorb")
public class WarenkorbController {

    private Map<Integer, Artikel> warenkorbItemMap;

    private List<Artikel> warenKorbList;

    //needed
    private Map<Integer, Integer> anzahlen;

    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public WarenkorbController() {
        this.warenkorbItemMap = new HashMap<Integer, Artikel>();
        this.anzahlen = new HashMap<Integer, Integer>();
    }

    public Map<Integer, Artikel> getWarenkorbItemMap() {
        return this.warenkorbItemMap;
    }

    public void setArtikelMap(Map<Integer, Artikel> warenkorbItemMap) {
        this.warenkorbItemMap = warenkorbItemMap;
    }

    public void removeArtikel(Artikel warenkorbItem) {
        this.warenkorbItemMap.remove(warenkorbItem);
    }

    public void addArtikel(Artikel artikel) {

        int id = artikel.getId();

        System.out.println(this.warenkorbItemMap);

        if(warenkorbItemMap.containsKey(id)) {

            this.anzahlen.put(artikel.getId(), artikel.getAnzahl()+this.anzahlen.get(id));

            this.warenkorbItemMap.get(id).setAnzahl(this.anzahlen.get(artikel.getId()));

            return;
        }
        this.anzahlen.put(artikel.getId(), artikel.getAnzahl());
        this.warenkorbItemMap.put(artikel.getId(), artikel);
    }

    public List<Artikel> getWarenKorbList() {
        return new ArrayList<Artikel>(this.warenkorbItemMap.values());
    }

    public void setWarenKorbList(List<Artikel> warenKorbList) {
        this.warenKorbList = warenKorbList;
    }
}

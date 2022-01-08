package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.HashMap;
import java.util.Map;

@SessionScoped
@ManagedBean(name = "warenkorb")
public class WarenkorbController {

    private Map<Integer, WarenkorbItem> warenkorbItemMap;

    private Integer tempAnzahl = 1;

    public WarenkorbController() {
        this.tempAnzahl = 1;
        this.warenkorbItemMap = new HashMap<Integer, WarenkorbItem>();
    }

    public Map<Integer, WarenkorbItem> getWarenkorbItemMap() {
        return this.warenkorbItemMap;
    }

    public void setArtikelMap(Map<Integer, WarenkorbItem> warenkorbItemMap) {
        this.warenkorbItemMap = warenkorbItemMap;
    }

    public Integer getTempAnzahl() {
        return tempAnzahl;
    }

    public void setTempAnzahl(Integer tempAnzahl) {
        this.tempAnzahl = tempAnzahl;
    }

    public void removeArtikel(WarenkorbItem warenkorbItem) {
        this.warenkorbItemMap.remove(warenkorbItem);
    }

    public void addArtikel(Artikel artikel) {

        int id = artikel.getId();

        WarenkorbItem warenkorbItem = new WarenkorbItem(artikel, this.tempAnzahl);

        //System.out.println(warenkorbItem);

        if(warenkorbItemMap.containsKey(id)) {
            warenkorbItemMap.get(artikel.getId()).setAnzahl(warenkorbItem.getAnzahl() + warenkorbItemMap.get(id).getAnzahl());
            return;
        }
        this.warenkorbItemMap.put(artikel.getId(), new WarenkorbItem(artikel, this.tempAnzahl));
    }
}

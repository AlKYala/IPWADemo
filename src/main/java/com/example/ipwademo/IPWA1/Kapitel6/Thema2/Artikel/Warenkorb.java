package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Map;

@SessionScoped
@ManagedBean(name = "warenkorb")
public class Warenkorb {

    private Map<Integer, WarenkorbItem> warenkorbItemMap;

    public Map<Integer, WarenkorbItem> getWarenkorbItemMap() {
        return this.warenkorbItemMap;
    }

    public void setArtikelMap(Map<Integer, WarenkorbItem> warenkorbItemMap) {
        this.warenkorbItemMap = warenkorbItemMap;
    }

    public void removeArtikel(WarenkorbItem warenkorbItem) {
        this.warenkorbItemMap.remove(warenkorbItem);
    }

    public void addArtikel(Artikel artikel, int anzahl) {
        int id = artikel.getId();
        if(warenkorbItemMap.containsKey(id)) {
            warenkorbItemMap.get(artikel.getId()).setAnzahl(anzahl + warenkorbItemMap.get(id).getAnzahl());
            return;
        }
        this.warenkorbItemMap.put(artikel.getId(), new WarenkorbItem(artikel, anzahl));
    }
}

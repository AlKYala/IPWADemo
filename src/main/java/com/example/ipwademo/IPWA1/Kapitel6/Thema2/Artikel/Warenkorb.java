package com.example.ipwademo.IPWA1.Kapitel6.Thema2.Artikel;

import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.math.BigDecimal;
import java.util.*;

@SessionScoped
@ManagedBean(name = "warenkorb")
public class Warenkorb {

    private Map<Integer, Artikel> warenkorbItemMap;

    private List<Artikel> warenKorbList;

    //needed
    private Map<Integer, Integer> anzahlen;

    private Integer num;

    private boolean showMessageInList;
    private boolean showMessageInCart;
    private boolean showMessageInCreate;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Warenkorb() {
        this.warenkorbItemMap = new HashMap<Integer, Artikel>();
        this.warenKorbList = new ArrayList<Artikel>();
        this.anzahlen = new HashMap<Integer, Integer>();
        this.showMessageInList = true;
    }

    public Map<Integer, Artikel> getWarenkorbItemMap() {
        return this.warenkorbItemMap;
    }

    public void setArtikelMap(Map<Integer, Artikel> warenkorbItemMap) {
        this.warenkorbItemMap = warenkorbItemMap;
    }

    public List<Artikel> getWarenKorbList() {
        return this.warenKorbList;
    }

    public void setWarenKorbList(List<Artikel> warenKorbList) {
        this.warenKorbList = warenKorbList;
    }

    public boolean getShowMessageInList() {
        return this.showMessageInList;
    }

    public void setShowMessageInList(boolean showMessageInList) {
        this.showMessageInList = showMessageInList;
        System.out.printf("ListView: %s\n", this.getShowMessageInList());
    }

    public boolean getShowMessageInCart() {
        return showMessageInCart;
    }

    public void setShowMessageInCart(boolean showMessageInCart) {

        this.showMessageInCart = showMessageInCart;
        System.out.printf("CartView: %s\n", this.getShowMessageInCart());
    }

    public boolean getShowMessageInCreate() {
        return showMessageInCreate;
    }

    public void setShowMessageInCreate(boolean showMessageInCreate) {

        this.showMessageInCreate = showMessageInCreate;
        System.out.printf("CreateView: %s\n", this.getShowMessageInCreate());
    }

    public void addArtikelView(Artikel artikel) {
        this.addArtikel(artikel);
        this.updateEinkaufswagenView();
        this.giveArtikelAddedInfo(artikel);
    }

    private void addArtikel(Artikel artikel) {

        int id = artikel.getId();

        int anzahl = (warenkorbItemMap.containsKey(id))
                ? artikel.getAnzahl()+this.anzahlen.get(id)
                : artikel.getAnzahl();

        artikel.setAnzahl(anzahl);

        this.anzahlen.put(artikel.getId(), anzahl);
        this.warenkorbItemMap.put(artikel.getId(), artikel);
        this.addToWarenkorbList(artikel);
    }

    public void addToWarenkorbList(Artikel artikel) {
        Optional<Artikel> foundArtikel =
                this.warenKorbList.stream()
                        .filter(warenkorbItem -> warenkorbItem.getId() == artikel.getId())
                        .findFirst();
        if(foundArtikel.isPresent()) {
            foundArtikel.get().setAnzahl(artikel.getAnzahl());
            return;
        }
        this.warenKorbList.add(artikel);
    }

    private void removeArtikel(Artikel warenkorbItem) {

        this.warenkorbItemMap.remove(warenkorbItem.getId());
        this.warenkorbItemMap.remove(warenkorbItem.getId());
        this.warenKorbList.removeIf(artikel -> artikel.getId() == warenkorbItem.getId());

    }

    public void removeArtikelView(Artikel artikel) {
        this.removeArtikel(artikel);
        this.giveArtikelDeletedInfo(artikel);
        this.updateEinkaufswagenView();
    }

    public void changeAnzahl(Artikel artikel) {
        if(artikel.getAnzahl() == 0) {
            this.removeArtikelView(artikel);
            return;
        }
        this.removeArtikel(artikel);
        this.giveNumberChangedInfo(artikel);
        this.addArtikel(artikel);
        this.updateEinkaufswagenView();
    }


    //AJAX

    //https://primefaces.github.io/primefaces/11_0_0/#/core/ajaxRendering - Dynamic/Runtime Updates
    public void updateEinkaufswagenView() {
        PrimeFaces.current().ajax().update("warenKorbForm");
    }

    public void allowCreateMessageShow() {
        this.setShowMessageInCreate(true);
        this.setShowMessageInCart(false);
        this.setShowMessageInList(false);
    }

    public void allowListMessageShow() {
        this.setShowMessageInCreate(false);
        this.setShowMessageInCart(false);
        this.setShowMessageInList(true);
    }

    public void allowCartMessageShow() {
        this.setShowMessageInCreate(false);
        this.setShowMessageInCart(true);
        this.setShowMessageInList(false);
    }

    // MESSAGES

    public void giveArtikelAddedInfo(Artikel artikel) {
        this.allowListMessageShow();
        String message = String.format("Zum Warenkorb hinzugefuegt: %s - Anzahl: %d - Preis: %s",
                artikel.getName(), artikel.getAnzahl(), artikel.getWarenkorbPrice());

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", message));
    }

    public void giveNumberChangedInfo(Artikel artikel) {
        this.allowCartMessageShow();
        String message = String.format("Anzahl geandert: %s - Anzahl: %d, Preis: %s",
                artikel.getName(), artikel.getAnzahl(), artikel.getWarenkorbPrice());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", message));
    }

    public void giveArtikelDeletedInfo(Artikel artikel) {
        this.allowCartMessageShow();
        String message = String.format("Aus dem Warenkorb entfernt: %s", artikel.getName());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", message));
    }
}

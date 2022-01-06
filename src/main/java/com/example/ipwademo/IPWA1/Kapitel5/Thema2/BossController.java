package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

@ViewScoped //View scoped aber der Service ist application scoped - also die manipulierungen bleiben erhalten so lange du den server nicht runterfaehrst
@ManagedBean
public class BossController {

    private int index = 0;

    public Character getCharacter() {
        return BossService.getInstance().getMitglieder().get(this.index);
    }

    public void inc() {
        index = (index+1) % BossService.getInstance().getMitglieder().size();
    }

    public void dec() {
        index = (index-1) % BossService.getInstance().getMitglieder().size();
    }

    public void remove() {
        BossService.getInstance().remove(this.index);
    }

    /*public Character addCharacter() {
       TODO
    }*/
}

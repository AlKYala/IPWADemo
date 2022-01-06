package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class SubmitBean extends CustomCharacter {

    public void submit() {
        BossService.getInstance().getMitglieder().add(this.clone());
        this.clear();
    }

    private void clear() {
        this.setVorname("");
        this.setNachname("");
        this.setDescription("");
        this.setPictureUrl("");
    }

}

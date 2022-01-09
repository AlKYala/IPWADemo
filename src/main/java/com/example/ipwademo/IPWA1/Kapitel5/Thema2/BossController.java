package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/*View scoped aber der Service ist application scoped - also die manipulierungen bleiben erhalten so lange du den server nicht runterfaehrst
View Scoped bewirkt in diesem Fall nur, dass du bei index 0 anfaengst
 */
@ManagedBean
@ViewScoped
public class BossController {

    private int index = 0;

    public CustomCharacter getCharacter() {
        System.out.println(BossService.getInstance().getMitglieder());
        return BossService.getInstance().getMitglieder().get(this.index);
    }

    public int getIndex() {
        return this.index;
    }

    public void inc() {
        index = (index+1) % BossService.getInstance().getMitglieder().size();
    }

    public void dec() {
        index = (index == 0) ? index = BossService.getInstance().getMitglieder().size()-1 : index-1; //modulo wollte nicht
        System.out.println(index);
    }

    public void remove() {

        BossService.getInstance().remove(this.index);
        this.dec();
    }

    public void duplicate() {
        CustomCharacter clone = getCharacter().clone();
        BossService.getInstance().getMitglieder().add(clone);
    }

    /*public Character addCharacter() {
       TODO
    }*/
}

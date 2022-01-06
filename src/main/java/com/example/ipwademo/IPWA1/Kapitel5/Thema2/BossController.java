package com.example.ipwademo.IPWA1.Kapitel5.Thema2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Character;

import java.util.List;

/*View scoped aber der Service ist application scoped - also die manipulierungen bleiben erhalten so lange du den server nicht runterfaehrst
View Scoped bewirkt in diesem Fall nur, dass du bei index 0 anfaengst
 */
@ManagedBean
@ViewScoped
public class BossController {

    private int index = 3;

    public CustomCharacter getCharacter() {
        index %= BossService.getInstance().getMitglieder().size();
        System.out.println(this.index);
        System.out.println(BossService.getInstance().getMitglieder().size());
        return BossService.getInstance().getMitglieder().get(this.index);
    }

    public void inc() {
        index++;
        System.out.println("inc");
    }

    public void dec() {
        index--;
        System.out.println(this.index);
    }

    public void remove() {
        BossService.getInstance().remove(this.index);
    }

    public void duplicate() {
        CustomCharacter clone = getCharacter().clone();
        BossService.getInstance().getMitglieder().add(clone);
    }

    /*public Character addCharacter() {
       TODO
    }*/
}

package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;


import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Application scoped damit der ApplicationScoped bean nicht davon betroffen ist
 */

@ApplicationScoped
@ManagedBean()
public class BeansContainer {

    List<Charakter> characterList = new ArrayList<Charakter>();

    public BeansContainer() {
        characterList = new ArrayList<>();

        characterList.add(
                new NoneCharacter(
                        "John",
                "McAfee",
                "Der wahrscheinlich laessigste Nerd aller Zeiten. #whackd",
                "https://img.br.de/9353731c-80dc-43c9-baaf-b4b94b08f83b.jpeg?q=80&rect=314,221,2904,1633"));


    }

}

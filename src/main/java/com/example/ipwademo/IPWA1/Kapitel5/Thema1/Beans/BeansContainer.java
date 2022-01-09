package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;


import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Warum solltest du dies nicht nutzen?
 *
 * Dieser beanscontainer ist Application Scoped
 * Auch Instanzen die None Scoped sind werden hier als POJOs behandelt und verhalten sich so wie
 * das scope dieser Klasse vorschreibt. Ich kommentier das aus.
 *
 * Demensrpechend, waere das hier NoneScoped z.B. dann wuerden keine Aenderungen gemacht werden,
 * bei Request Scoped die Aenderungen mit jedem Request erstmal auf Default zureuckgesetzt und dann die "neue" Request
 * angewandt etc.
 */

@ApplicationScoped
@ManagedBean()
public class BeansContainer {

    List<Charakter> characterList = new ArrayList<Charakter>();

    /**
     * UNUSED!
     */

    public BeansContainer() {
        this.initData();
    }

    public List<Charakter> getCharacterList() {
        return characterList;
    }

    private void initData() {
        characterList = new ArrayList<>();

        characterList.add(
                new NoneCharacter(
                        "John",
                        "McAfee",
                        "Der wahrscheinlich laessigste Nerd aller Zeiten. #whackd",
                        "https://img.br.de/9353731c-80dc-43c9-baaf-b4b94b08f83b.jpeg?q=80&rect=314,221,2904,1633"));

        characterList.add(
                new RequestCharacter(
                        "Knight Industries",
                        "Two Thousand",
                        "Ein Auto. Ein Computer",
                        "https://cdn1.vogel.de/unsafe/800x0/smart/images.vogel.de/vogelonline/bdb/1783000/1783059/original.jpg"));

        characterList.add(
                new ViewCharacter(
                        "David",
                        "Hasselhoff",
                        "Ein Mann.",
                        "https://www.bz-berlin.de/data/uploads/2021/01/dpa_5fa4480086ca5a54_1611479987-768x432.jpg"));

        characterList.add(
                new ViewCharacter(
                        "Monki",
                        "Flip",
                        "OH OH AH AH",
                        "https://c.tenor.com/7kzP_bmlzccAAAAM/monkiflip-monki.gif"));

        characterList.add(
                new ViewCharacter(
                        "Kiryu",
                        "Kazuma",
                        "Ein 50 Jahre alter Japaner der jede Mafia in Asien mehrmals verkloppt hat.",
                        "https://cdn.mos.cms.futurecdn.net/N3ukr4EHcFAjmQLtcUrnQR-480-80.jpg"));
    }

    public void setCharacterList(List<Charakter> characterList) {
        this.characterList = characterList;
    }
}

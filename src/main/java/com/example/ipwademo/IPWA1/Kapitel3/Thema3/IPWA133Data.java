package com.example.ipwademo.IPWA1.Kapitel3.Thema3;

import java.util.ArrayList;

public class IPWA133Data {

    private static ArrayList<Band> bands;

    private IPWA133Data() {
        this.bands = new ArrayList<Band>();
            bands.add(new Band("Van Halen", "David Lee Roth", "Eddie Van halen", "Mark Stone", "Alex Van Halen"));
            bands.add(new Band("Judas Priest", "Rob Halford", "Glenn Tipton & Richie Faulkner", "Ian Hill", "Scott Travis"));
            bands.add(new Band("Deep Purple", "Ian Gillian", "Ritchie Blackmore", "Roger Glover", "Ian Palce"));
    }

    public static ArrayList<Band> getData() {
        if(bands == null) {
            new IPWA133Data();
        }
        return bands;
    }
}

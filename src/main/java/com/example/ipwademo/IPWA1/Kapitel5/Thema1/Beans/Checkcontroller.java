package com.example.ipwademo.IPWA1.Kapitel5.Thema1.Beans;

import com.example.ipwademo.IPWA1.Kapitel5.Thema1.shared.Charakter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class Checkcontroller {

    public void debugCharakter(Charakter charakter) {
        System.out.println(charakter.toString());
    }

    public void debugAllCharakter(List<Charakter> charakterList) {
        System.out.println(charakterList);
    }
}

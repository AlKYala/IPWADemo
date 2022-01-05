package com.example.ipwademo.IPWA1.Kapitel4.Thema2;

import com.example.ipwademo.IPWA1.Kapitel3.Thema3.Band;
import com.example.ipwademo.IPWA1.Kapitel3.Thema3.IPWA133Data;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ApplicationScoped
@ManagedBean(name = "bands")
public class BandBean {

    private ArrayList<BandMitBild> bands;

    public ArrayList<BandMitBild> getBands() {
        if(bands == null) {
            this.initData();
        }
        return this.bands;
    }

    private void initData() {
        this.bands = new ArrayList<BandMitBild>();
        for(Band band : IPWA133Data.getData()) {
            this.addBandMitBild(this.migrateBand(band));
        }
        this.bands.get(0).setPicUrl("https://www.rockhall.com/sites/default/files/styles/c03g_desktop_1920_870/public/2019-11/vanhalen_002.jpg?h=e3c4a1bd&itok=5jaqCOJm"); //Van halen
        this.bands.get(1).setPicUrl("https://townsquare.media/site/366/files/2021/08/attachment-judas-priest-2.jpeg"); //Judas Priest
        this.bands.get(2).setPicUrl("https://img.discogs.com/9O8ipDeEAjogcKT3BNJEZhKX5PY=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-170355-1482430561-6661.jpeg.jpg"); //Deep Purple
    }

    public void addBandMitBild(BandMitBild bandMitBild) {
        this.bands.add(bandMitBild);
    }

    private BandMitBild migrateBand(Band b) {
        BandMitBild bandMitBild = new BandMitBild();
        bandMitBild.setName(b.getName());
        bandMitBild.setSaenger(b.getSaenger());
        bandMitBild.setGitarrist(b.getGitarrist());
        bandMitBild.setBassist(b.getBassist());
        bandMitBild.setDrummer(b.getDrummer());
        return bandMitBild;
    }

    private BandMitBild migrateBand(Band b, String picUrl) {
        BandMitBild bandMitBild = this.migrateBand(b);
        bandMitBild.setPicUrl(picUrl);
        return bandMitBild;
    }
}

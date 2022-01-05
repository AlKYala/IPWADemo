package com.example.ipwademo.IPWA1.Kapitel4.Thema2;

import com.example.ipwademo.IPWA1.Kapitel3.Thema3.Band;

public class BandMitBild extends Band {

    private String picUrl;

    public BandMitBild() {
        super();
    }

    public BandMitBild(String name, String saenger, String gitarrrist, String bassist, String drummer, String picUrl) {
        super(name, saenger, gitarrrist, bassist, drummer);
        this.setPicUrl(picUrl);
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String url) {
        this.picUrl = url;
    }
}

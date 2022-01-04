package com.example.ipwademo.IPWA1.Kapitel4.Thema1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "customBeanName141") //um mit diesem namen auf das Bean zuzugreifen
@SessionScoped
public class SampleBean implements Serializable {

    private String val = "default val";

    public String getVal() {
        return this.val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void resetString() {
        this.setVal("Reset");
    }
}

/**
 * JSF Seiten greifen auf Beans zu
 */
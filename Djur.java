package com.ooj.uppgift1;

/**
 * Created by Abel Shiferaw Mamo
 * Date: 2020-09-28
 * Time: 16:52
 * Project name: OOJ programering
 */
public class Djur {

    private String namn;
    private double vikt;

    public Djur(){}

    public Djur (String namn, double vikt){
        this.namn = namn;
        this.vikt = vikt;

    }

    public String getNamn(){
        return namn;
    }

    public void setNamn(String namn){
        this.namn = namn;
    }

    public double getVikt(){
        return vikt;
    }

    public void setVikt(double vikt){
        this.vikt = vikt;
    }

}

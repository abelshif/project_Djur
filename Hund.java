package com.ooj.uppgift1;

import com.ooj.övning3a.Kurs;

/**
 * Created by Abel Shiferaw Mamo
 * Date: 2020-09-28
 * Time: 16:54
 * Project name: OOJ programering
 */
public class Hund extends Djur implements IPrintable {

    private String namn;
    private double vikt;

    public Hund (){
        super();
    }

    public Hund(String namn, double vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    @Override
    public String getNamn() {
        return namn;
    }

    @Override
    public void setNamn(String namn) {
        this.namn = namn;
    }

    @Override
    public double getVikt() {
        return vikt;
    }

    @Override
    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    @Override
    public double getMatVikt(double vikt) {
            return vikt/100;
    }
}




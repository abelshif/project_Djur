package com.ooj.uppgift1;

/**
 * Created by Abel Shiferaw Mamo
 * Date: 2020-09-28
 * Time: 16:55
 * Project name: OOJ programering
 */
public class Orm extends Djur implements IPrintable{
    private String namn;
    private double vikt;
    private final double matVikt = 20;

    public Orm (){
        super();
    }

    public Orm(String namn, double vikt) {
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

    public double getMatVikt(){
        return matVikt;

    }

    @Override
    public double getMatVikt(double vikt) {
        return matVikt;
    }
}

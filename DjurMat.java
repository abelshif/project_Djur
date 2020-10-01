package com.ooj.uppgift1;

/**
 * Created by Abel Shiferaw Mamo
 * Date: 2020-09-30
 * Time: 14:28
 * Project name: OOJ programering
 */
public enum DjurMat {
    KATTFOOD("kattfoder"),
    HUNDFOOD("hundfoder"),
    ORMFOOD("ormpellets");

    private final String matTyp;

    DjurMat(String matTyp) {
        this.matTyp = matTyp;
    }

    public String getMatTyp() {
        return matTyp;
    }
}

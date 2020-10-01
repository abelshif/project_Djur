package com.ooj.uppgift1;

import java.util.Scanner;

/**
 * Created by Abel Shiferaw Mamo
 * Date: 2020-09-28
 * Time: 19:02
 * Project name: OOJ programering
 */
public class DjurMain {

    public static void main(String[] args) {

        boolean bool = true;
        while (bool){
            try {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Vilket djur ska få mat?");
                    String djurNamn = scan.nextLine();

                    DjurTyp(djurNamn);
                    System.out.println("Continue ? (y/n)");
                    String response = scan.nextLine();
                    if (response.equalsIgnoreCase("y"))
                        bool = true;
                    else
                        bool = false;

            }
            catch (Exception e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
    }

    private static void DjurTyp(String djur) {

        DjurMat mat1 = DjurMat.HUNDFOOD;
        DjurMat mat2 = DjurMat.KATTFOOD;
        DjurMat mat3 = DjurMat.ORMFOOD;

        try {

            if (djur != null && djur.equalsIgnoreCase("Sixten")) {
                Hund hund = new Hund("Sixten", 5000);
                double matViktSixteen = Math.round(hund.getMatVikt(hund.getVikt()));
                System.out.println(hund.getNamn() + " ska få " + matViktSixteen + " gram av " + mat1.getMatTyp());
            } else if (djur != null && djur.equalsIgnoreCase("Dogge")) {
                Hund hund = new Hund("Dogge", 10000);
                double matViktDogge = Math.round(hund.getMatVikt(hund.getVikt()));
                System.out.println(hund.getNamn() + " ska få " + matViktDogge + " gram av " + mat1.getMatTyp());
            } else if (djur != null && djur.equalsIgnoreCase("Venus")) {
                Katt katt = new Katt("Venus", 5000);
                double matViktKatt = Math.round(katt.getMatVikt(katt.getVikt()));
                System.out.println(katt.getNamn() + " ska få " + matViktKatt + " gram av " + mat2.getMatTyp());
            } else if (djur != null && djur.equalsIgnoreCase("Ove")) {
                Katt katt = new Katt("Ove", 3000);
                double matViktKatt = Math.round(katt.getMatVikt(katt.getVikt()));
                System.out.println(katt.getNamn() + " ska få " + matViktKatt + " gram av " + mat2.getMatTyp());
            } else if (djur != null && djur.equalsIgnoreCase("Hypno")) {
                Orm orm = new Orm("Hypno", 1000);
                double matViktOrm = Math.round(orm.getMatVikt(orm.getVikt()));
                System.out.println(orm.getNamn() + " ska få " + matViktOrm + " gram av " + mat3.getMatTyp());
            } else {
                System.out.println("Kan inte hitta djur namnet eller ogiltigt input");
            }
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }

    }
}


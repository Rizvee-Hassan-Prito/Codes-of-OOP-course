/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamedemo;

/**
 *
 * @author User
 */
public class IcecreameDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Icecream[] icecreamArray = new Icecream[2];

        icecreamArray[0] = new Icecream();
        icecreamArray[1] = new Icecream();

        icecreamArray[0].setIcecreamType("Chocolate Bar");
        icecreamArray[0].setIcecreamCompany("Igloo");
        icecreamArray[0].setIcecreamPrice(100);

        icecreamArray[1].setIcecreamType("Vnailla");
        icecreamArray[1].setIcecreamCompany("Kwality");
        icecreamArray[1].setIcecreamPrice(100);

        boolean flag = icecreamArray[0].equals(icecreamArray[1]);
        System.out.println(flag);
        int litmus = icecreamArray[0].compareTo(icecreamArray[1]);
        System.out.println(litmus);

        /*Icecream mega=new Icecream();
        Icecream cornetto= new Icecream("cone","Polar",100);
        //mega.icecreamType="Vanilla";
        //mega.icecreamCompany="Igloo";
        //mega.icecreamPrice=35.00;
        
        String megaInfo =mega.toString();
        String cornettoInfo =cornetto.toString();
        
         System.out.println(megaInfo);
         System.out.println(cornettoInfo);*/
    }

}

class Icecream {

    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    Icecream() {
        icecreamPrice = 0;
    }

    public String toString() {
        String icecreamInformation = this.icecreamType + " " + this.icecreamCompany + " " + this.icecreamPrice;

        return icecreamInformation;
    }

    String getIcecreamType() {
        return this.icecreamType;
    }

    void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    String getIcecreamCompany() {
        return this.icecreamCompany;
    }

    void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    double getIcecreamPrice() {
        return this.icecreamPrice;
    }

    void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    boolean equals(Icecream I) {
        if (this.icecreamPrice == I.icecreamPrice) {
            return true;
        } else {
            return false;
        }
    }

    int compareTo(Icecream I) {
        if (this.icecreamPrice > I.icecreamPrice) {
            return 1;
        } else if (this.icecreamPrice == I.icecreamPrice) {
            return 0;
        } else {
            return -1;
        }
    }

}

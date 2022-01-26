
package lab5problem1;

import java.util.Scanner;

public class Lab5Problem1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Icecream[] iceArray = new Icecream[2];

        for (int i = 0; i < 2; i++) {

            iceArray[i] = new Icecream();

            iceArray[i].setIcecreamType(input.nextLine());
            iceArray[i].setIcecreamCompany(input.nextLine());
            iceArray[i].setIcecreamPrice(input.nextInt());
            input.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            searchByCompany(iceArray[i].getIcecreamCompany(), iceArray[i]);
        }

    }

    static void searchByCompany(String companyName, Icecream i) {

        System.out.println(i.getIcecreamType() + " " + i.getIcecreamCompany() + " " + i.getIcecreamPrice());
    }

}

class Icecream {

    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    Icecream() {

    }

    Icecream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    public String toString() {
        String icecreamInformation = this.icecreamType + " " + this.icecreamCompany
                + " " + this.icecreamPrice;

        return icecreamInformation;
    }

    public String getIcecreamType() {
        return this.icecreamType;
    }

    void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamCompany() {
        return this.icecreamCompany;
    }

    void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public double getIcecreamPrice() {
        return this.icecreamPrice;
    }

    void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

}

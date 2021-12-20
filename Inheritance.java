/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Human tam = new Human();
        tam.name = "TAM";
        tam.age = 25;
        tam.institutionName = "DCC";
        tam.ID = 30;
        tam.NID = 84382349;
        tam.address = "Gulshan";

        tam.friendtInforfamtion();
        tam.humanInformation();
        tam.studentInformation();

    }
}

class Friend {

    protected String name;
    protected int age;
    //Friend(int a){
        
    //}

    void friendtInforfamtion() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

class Student extends Friend {

    //Student(){
      //  super(10);
    //}
    String institutionName;
    int ID;

    void studentInformation() {
        System.out.println("Institution: " + institutionName);
        System.out.println("ID: " + ID);
    }
}

class Human extends Student {

    long NID;
    String address;

    void humanInformation() {
        System.out.println("NID " + NID);
        System.out.println("address: " + address);
    }
}

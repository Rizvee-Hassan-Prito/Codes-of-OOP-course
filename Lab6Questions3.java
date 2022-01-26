/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6questions3;

/**
 *
 * @author User
 */
public class Lab6Questions3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee=new Employee();
        employee.Name="Ellie";
        employee.address=" los angels";
        employee.age=20;
        employee.phoneNumber=7833;
        employee.salary=20000;
        Manager manager=new Manager();
        manager.Name="Joel";
        manager.address=" los angels";
        manager.age=55;
        manager.phoneNumber=9463;
        manager.salary=400000;
    }

}

class Member {

    String Name;
    int age;
    int phoneNumber;
    String address;
    int salary;

    void printSalary() {
        System.out.println(salary);
    }
}
    class Employee extends Member {

        String specialization;
    }

    class Manager extends Member {

        String department;
    }


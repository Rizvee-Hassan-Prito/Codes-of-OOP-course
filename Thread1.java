/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */

class Table{
    synchronized void printTable(int n){
//synchronized(this){
         for (int i = 1; i <= 5; i++){
              System.out.println(Thread.currentThread().getName()+": " + n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        //}
    }
}

 class Thread1 extends Thread {

    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
 class Thread2 extends Thread {

    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
    
class ThreadSynchronization{
    public static void main(String[] args) {
        // TODO code application logic here
        Table obj=new Table();
        Thread1 t1=new Thread1(obj);
        t1.start();
        Thread2 t2=new Thread2(obj);
        t2.start();
    }

}
  /*public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
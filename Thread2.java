/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author User
 */
public class Thread2 implements Runnable {

    /**  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread2 th=new Thread2();
        Thread t=new Thread(th);
        t.start();
        
        Thread2 tr=new Thread2();
        Thread t2=new Thread(tr);
        t2.start();

    }

    
    @Override
        public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+": " + i);
        }
    }
    }



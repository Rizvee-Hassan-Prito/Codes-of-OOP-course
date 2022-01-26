/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8problemb;

/**
 *
 * @author User
 */
public class Lab8ProblemB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input=new java.util.Scanner(System.in);
        int n=input.nextInt();
        Player[] arr=new Player[n];
        for(int i=0;i<n;i++){
            arr[i]= new Player(input.next(),input.nextInt());
        }
        java.util.Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(arr[i].name+"\t"+arr[i].score); 
        }
    }

}

class Player implements Comparable<Player> {

    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Player p) {
        if (this.score > p.score) {
            return -1;
        } else if (this.score < p.score) {
            return 1;
        } else {
            if (this.name.compareTo(p.name) == 1) {
                return -1;
            } else if (this.name.compareTo(p.name) == -1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

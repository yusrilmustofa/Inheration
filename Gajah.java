/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author yusri
 */
public class Gajah extends Hewan {

    public static void testClassMethod() {
        System.out.println("The Class Method Name Is hewan...");
    }

     public void testInstanceMethod(){
        System.out.println("The Instace method is Gajah");
    }

    public static void main(String[] args) {
        Gajah MyGajah = new Gajah();
        Hewan MyHewan = new Hewan();
        Hewan.testClassMethod();
        MyGajah.testInstanceMethod();
    }
}

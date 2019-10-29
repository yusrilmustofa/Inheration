/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author yusri
 */
public class A {
    static int tambah(int a,int b){
        return a+b;
    }
    static double tambah(double a,double b){
        return a+b;
    }
    static int tambah(int a,int b,int c){
        return a+b+c;
    }
    public static void main (String[]args){
        int a=9;
        int b=12;
        int c=5;
        double d=0.5;
        
        System.out.println("1."+(a+b));
        System.out.println("2."+(a-b+d));
        System.out.println("3."+(a+b+c));
        System.out.println("4."+(a+b+c+d));
        
    }
}

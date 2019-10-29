/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author yusri
 */
public class B extends A {
    private int b;
    public void setB(int Nilai){
        b=Nilai;
    }
    public int getB(){
        return b;
    }
    public void TampilkanNilai(){
        super.TampilkanNilai();
        System.out.println("Nilai B:"+getB());
    }
}

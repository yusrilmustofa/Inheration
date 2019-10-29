/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan7;

/**
 *
 * @author yusri
 */
public class coba extends Latihan7 {
    private int Usia;
    public coba(int Usia,String Nama,String Mapel){
        super(Nama,Mapel);
        this.Usia=Usia;
    }
    public void info(){
        System.out.println("Usia:"+Usia);
        super.info();
    }
}

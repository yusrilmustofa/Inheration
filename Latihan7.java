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
public class Latihan7 {
    private String Nama;
    private String Mapel;
    
    public Latihan7(String Nama,String Mapel){
        this.Nama=Nama;
        this.Mapel=Mapel;
    }
    public void info(){
        System.out.println("Nama:"+Nama);
        System.out.println("Mapel:"+Mapel);
    }
}

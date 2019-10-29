/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author yusri
 */
public class MountainTruck extends Truck {
    public int seatHeight;
    public MountainTruck(int startHeight,int startCadence,int startSpeed,int startGear){
        super (startCadence,startSpeed,startGear);
        seatHeight=startHeight;
    }
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    public static void main (String[]args){
        System.out.println("Mulai Berjalan");
        MountainTruck MB=new MountainTruck(0,0,0,0);
        System.out.println("Gear:"+MB.Gear);
        System.out.println("Speed:"+MB.Speed);
        MB.setGear(2);
        MB.SpeedUP(2);
        System.out.println("Gear:"+MB.Gear);
        System.out.println("Speed:"+MB.Speed);
        MB.SpeedUP(5);
        System.out.println("Gear:"+MB.Gear);
        System.out.println("Speed:"+MB.Speed);
    }
}

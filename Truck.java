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
public class Truck {
    public int Cadence;
    public int Gear;
    public int Speed;
    public Truck(int startCadence,int startGear,int startSpeed){
        Gear=startGear;
        Speed=startSpeed;
        Cadence=startCadence;
    }
    public void setCadence(int newValue){
        Cadence=newValue;
    }
    public void ApplyBreak(int Decreement){
        Speed=Decreement;
    }
    public void SpeedUP(int Increment){
        Speed=Increment;
    }
    public void setGear(int newValue){
        Gear=newValue;
    }
}

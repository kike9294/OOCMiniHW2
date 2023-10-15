/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author enriq
 */
public class Drone implements Flyable {
    
    //Properties
    private float goUp;
    private float goForward;
    private float direction;

    //Constructor
    public Drone(float goUp, float goForward, float direction) {
        this.goUp = goUp;
        this.goForward = goForward;
        this.direction = direction;
    }
    
    

    //Methods
    @Override
    public void changeAltitude(float change) {
        this.goUp = change;
    }

    @Override
    public float getAltitude() {
        return this.goUp;
    }

    @Override
    public void accelerate(float speed) {
        this.goForward = speed;
    }

    @Override
    public void brake() {
        System.out.println("The drone is desacelerating");
    }

    @Override
    public void turn(float angle) {
        this.direction = angle;
    }

    @Override
    public float getDirection() {
        return this.direction;
    }

    @Override
    public float getSpeed() {
        return this.goForward;
    }

    //Have no idea what this two last methods mean!.
    @Override
    public String getMake() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

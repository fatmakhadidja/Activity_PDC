package models;

public class Vehicule {

    private String id;
    private String position;
    private String battery_level;
    private Mode mode;
    private String current_speed;

    public Vehicule(){}

    public void setMode(Mode mode){

        this.mode= mode;
    }

    public void setCurrentSpeed(String currentSpeed){
        this.current_speed = currentSpeed;
    }

    
}

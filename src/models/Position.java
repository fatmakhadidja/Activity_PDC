package models;

public class Position {
    
    private String x;
    private String y;
    private String z;

    public Position(String x, String y,String z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String getx(){
        return this.x;
    }
    public String gety(){
        return this.y;
    }
    public String getz(){
        return this.z;
    }
}

package za.ac.cput.ADP372s_Assignment1;

public class Car {

    private int speed;
    private String model;
    private boolean fast = false;

    public Car(String model,int speed){
        this.model = model;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFast() {
        return fast;
    }

    public void modifyCar(){
        fast = true;
    }
}

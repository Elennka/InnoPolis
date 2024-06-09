package Homework4Car;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int currentSpeed = 0;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {

        return this.currentSpeed;
    }

    //метод увеличения скорости
    public void speedUp(int interval) {
        this.currentSpeed = this.currentSpeed + interval;
    }

    //метод снижения скорости
    public void speedBreak() {

        if (this.currentSpeed <= 10) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed = this.currentSpeed - 10;
        }
    }
}

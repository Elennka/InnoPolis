package Homework4Car;

public class MyProgram {
    public static void main(String[] args) {

        int currentSpeed;
        Car newCar=new Car("Kia","ria","red");

        currentSpeed=newCar.getCurrentSpeed();
        System.out.println("Текущая скорость равна "+currentSpeed);

        newCar.speedUp(25);
        currentSpeed=newCar.getCurrentSpeed();
        System.out.println("Текущая скорость равна "+currentSpeed);

        newCar.speedBreak();
        currentSpeed=newCar.getCurrentSpeed();
        System.out.println("Текущая скорость равна "+currentSpeed);
        newCar.speedBreak();
        currentSpeed=newCar.getCurrentSpeed();
        System.out.println("Текущая скорость равна "+currentSpeed);
        newCar.speedBreak();
        currentSpeed=newCar.getCurrentSpeed();
        System.out.println("Текущая скорость равна "+currentSpeed);

    }
}

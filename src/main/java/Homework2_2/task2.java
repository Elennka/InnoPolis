package Homework2_2;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        Room kitchen= new Room("kitchen",10.5);
        Room livingroom= new Room("livingroom",20.5);
        Room bedroom= new Room("kitchen",9.3);


        Flat flat1=new Flat(
                "Казань, ул.Победы, 33-25",
                2,
                46.8,
                true,
                false,
                5,
                Arrays.asList(bedroom, kitchen, livingroom));


    }
}

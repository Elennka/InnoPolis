package Homework2_2;

import java.util.List;

public class Flat {
    String flatAddress;
    int roomsNumber;
    double flatSquare;
    boolean hasBalcony;
    boolean separateBathroom;
    int floor;
    List<Room> rooms;

    public Flat(
            String flatAddress,
            int roomsNumber,
            double flatSquare,
            boolean hasBalcony,
            boolean separateBathroom,
            int floor,
            List<Room>rooms) {
        this.flatAddress=flatAddress;
        this.roomsNumber=roomsNumber;
        this.flatSquare=flatSquare;
        this.hasBalcony=hasBalcony;
        this.separateBathroom=separateBathroom;
        this.floor=floor;
        this.rooms=rooms;

    }

}

package module01.lecture11;

import java.util.Locale;

public class Building {
    private int floors = 10;
    private int doors = 6;
    private String address = "XYZ";

    public void printStreet() {
        System.out.println("Building located at " + address);
    }

    public int getFloors() {
        return floors;
    }
    public void setFloors(final int floors) {
        this.floors = floors;
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(final int doors) {
        this.doors = doors;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }
    private void buildFloor() {

    }
    private void buildDoor() {

    }
    public void buildFullHouse() {
        buildFloor();
        buildDoor();
        System.out.println("Building Full House");
    }


}

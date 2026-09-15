public class Building {
    private int floors = 5;
    private int doors = 10;

    private String address = "XYZ";

    public void printStreet() {
        System.out.println("This building is situated at " + address);
    }

    public int getFloors() {
        return floors;
    }

    public int getDoors() {
        return doors;
    }

    public String getAddress() {
        return address;
    }


    public void setFloors(final int floors) {
        this.floors = floors;
    }

    public void setDoors(final int doors) {
        this.doors = doors;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



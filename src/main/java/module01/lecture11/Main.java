package module01.lecture11;

public class Main {
    static void main() {
        final Building building01 = new Building();
        building01.buildFullHouse();

        final Building building1 = new Building();
        building1.setFloors(80);

        final Building building2 = new Building();
        building2.setFloors(18);
        building2.setAddress("ABC");

        System.out.println("Building 1 has " + building1.getFloors() + " floors.");
        building1.printStreet();
        System.out.println("Building 2 has " + building2.getFloors() + " floors.");
        building2.printStreet();
        System.out.println("Building 2 has " + building1.getDoors() + " doors.");
        System.out.println("Building 2 has " + building2.getDoors() + " doors.");

    }
}

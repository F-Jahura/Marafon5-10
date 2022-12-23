package Day6;

public class Task6_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("White");
        car.setYear(2010);
        car.info();
        System.out.println("Model of the car: " + car.getModel());
        System.out.println("Color of the car: " + car.getColor());
        System.out.println("Year difference for car: " + car.yearDifference(2022));

        System.out.println();
        Motorbike motorbike = new Motorbike("Honda", "Black", 2014);
        motorbike.info();
        System.out.println("Model of motorbike: " + motorbike.getModel() +
                "\nColor of it: " + motorbike.getColor() + "\nYear of it: " + motorbike.getYear());
        System.out.println("Year difference for motorbike: " + motorbike.yearDifference(2021));


    }
}

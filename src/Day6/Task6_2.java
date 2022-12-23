package Day6;

public class Task6_2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2015, 3, 4);
        airplane.setYear(2020);
        airplane.setLength(2);

        airplane.fillup(2000);
        airplane.fillup(3000);
        airplane.info();

    }
}

package Day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setFuel(int fuel) {

        this.fuel = fuel;
    }

    public int getFuel(){
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public Airplane(){
    }

    public void info(){
        System.out.println("Manufacturer: " + manufacturer + "\nmanufacturing year: " + year +
                "\nLength: " + length + " M" + "\nWeight: " + weight + " Ton" + "\nquantity of fuel: " + fuel + " Litres");
    }

    public void fillup(int n){
         fuel = fuel + n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length > airplane2.length){
            System.out.println("Length of first airplane is bigger than second one");
        } else
            System.out.println("Length of second airplane is bigger than first one");
    }
}

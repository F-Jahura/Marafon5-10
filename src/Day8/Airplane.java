package Day8;

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

    public void info(){
        System.out.println("Manufacturer: " + manufacturer + "\nmanufacturing year: " + year +
                "\nLength: " + length + " M" + "\nWeight: " + weight + " Ton" + "\nquantity of fuel: " + fuel + " Litres");
    }

    public void fillup(int n){

        fuel = fuel + n;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}

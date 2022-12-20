package Work5;

public class Task5_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        System.out.println("Model of car: " + car.getModel());
        car.setColor("White");
        System.out.println("Color of car: " + car.getColor());
        car.setYear(2021);
        System.out.println("Year of car: " + car.getYear());

    }
}

class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String modelCar){
        model = modelCar;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String colorCar){
        color = colorCar;
    }

    public String getColor(){
        return color;
    }

    public void setYear(int yearCar){
        year = yearCar;
    }

    public int getYear(){
        return year;
    }

}

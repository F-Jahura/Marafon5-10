package Work5;

public class Task5_2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", "Red" , 2019);
        System.out.println("Model of motorbike: " + motorbike.getModel() +"\nColor of it: " +
                motorbike.getColor() + "\nYear of it: " + motorbike.getYear());
    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
}

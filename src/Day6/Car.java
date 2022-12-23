package Day6;

class Car {
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

    public void info(){
        System.out.println("It is car");
    }

    public int yearDifference(int inputYear){
        inputYear = Math.abs(inputYear - year);
        return inputYear;
    }




}

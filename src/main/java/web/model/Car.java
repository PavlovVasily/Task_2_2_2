package web.model;

public class Car {
    private int year;
    private String model;
    private String brand;


    public Car() {}

    public Car(String brand, String model, int year) {
        this.year = year;
        this.model = model;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

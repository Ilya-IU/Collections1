public class Car {
    private String Brand;
    private int number ;

    public Car(String brand, int number) {
        Brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return Brand;
    }

    public int getNumber() {
        return number;
    }
}

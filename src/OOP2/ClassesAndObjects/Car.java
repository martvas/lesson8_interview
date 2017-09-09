package OOP2.ClassesAndObjects;

public abstract class Car {
    private String brand;
    private int maxSpeed;


    public Car (String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void info (){
        System.out.println("Brand: " + brand + ". Max Speed: " + maxSpeed);
    }

    /**
     * ВОзвращает время затраченное на дорогу на макс. скорости
     * @param roadInKm
     * @return
     */
    public double roadOnMaxSpeed(int roadInKm){
        return (double) roadInKm / maxSpeed;
    }

    private void privateSout() {
        System.out.println("Ja privatnij metod");
    }
}

package OOP2.ExtendsTest;

import OOP2.ClassesAndObjects.Car;
import OOP2.InterfaceTest.BeepSound;

public class TirCar extends Car implements BeepSound {
    public TirCar(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public void doBeep() {
        System.out.println("Buuuu Buuuuuu");
    }
}

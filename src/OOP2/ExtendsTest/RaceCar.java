package OOP2.ExtendsTest;

import OOP2.ClassesAndObjects.Car;
import OOP2.InterfaceTest.BeepSound;

public class RaceCar extends Car implements BeepSound {
    private int nitroSpeed;

    public RaceCar(String brand, int maxSpeed, int nitroSpeed) {
        super(brand, maxSpeed);
        this.nitroSpeed = nitroSpeed;
    }

    //Private polja toljko getterami setterami mozhno vibratj
    @Override
    public double roadOnMaxSpeed(int roadInKm){
        return (double) roadInKm / getMaxSpeed();
    }

//    //Abstraktnij metod neljzja sdelatj v ne abstraktnom klasse
//    public abstract void abstractMethod(){
//        System.out.println("Abstraktnij metod v obichnom klasse");
//    }

    public double roadOnNitroSpeed(int roadInKm){
        return (double) roadInKm / nitroSpeed;
    }

    @Override
    public void doBeep() {
        System.out.println("Bim bim");
    }

//    //Neljzja pereopredelitj private metod, tak kak ego ne vidno iz klassov naslednikov
//    @Override
//    private void privateSout() {
//        System.out.println("Privatnij metod");
//    }
}

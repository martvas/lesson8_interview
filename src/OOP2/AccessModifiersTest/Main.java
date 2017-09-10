package OOP2.AccessModifiersTest;

import OOP2.AccessModifiers.Girl;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl(10, 10, "Blond");

        //К остальным методам не могу достучатся
        //private - в классе
        // default - в пакете
        //protected - пакет + наследник

        girl.publicMethod();
    }
}

package OOP2.AccessModifiersTest;

import OOP2.AccessModifiers.Girl;

public class Marta extends Girl {
    public Marta(int weight, int height, String hairColor) {
        super(weight, height, hairColor);
    }

    private void privateMethod() {
        System.out.println("Ne mogu on toljko dlja klassa");
    }

    void defaultMethod() {
        System.out.println("Не могу обратится так как Default - только для пакета");
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
    }
}

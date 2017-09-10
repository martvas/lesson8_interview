package OOP2.AccessModifiers;

public class Sasha extends Girl {
    public Sasha(int weight, int height, String hairColor) {
        super(weight, height, hairColor);
    }

    void  privateMethod(){
        System.out.println("Не могу обратится и заново пишу, так как приватный в родительском классе ");
    }

    @Override
    void defaultMethod() {
        System.out.println("Могу обратится так как в том же пакектк");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Могу переопределить");
    }

    @Override
    public void publicMethod() {
        System.out.println("Mogu obratitjsa");
    }
}

package OOP2.AccessModifiers;

public class Girl {
    private int weight;
    private int height;
    private String hairColor;

    public Girl(int weight, int height, String hairColor) {
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
    }

    private void privateMethod() {
        System.out.println("Я приватный метод");
    }

    void defaultMethod() {
        System.out.println("Я дефаулт метод");
    }

    protected void protectedMethod(){
        System.out.println("Я протекткд метод");
    }

    public void publicMethod() {
        System.out.println("Я публичный метод");
    }

}

package esercizio2;

public class Volontario implements Checkable {

    private String name;
    private int age;
    private String CV;

    public Volontario(String name, int age, String CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    public String toString() {
        return "Volontario: " + name + " Age: " + age + " CV: " + CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + name + " checked in");
    }
}

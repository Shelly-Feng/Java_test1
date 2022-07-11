import model.Tiger;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.setAge(5);
        t.setWeight(50);
        t.setEating("carnivore");
        t.setRunning("fast");
        System.out.println(t.getAge());
        System.out.println(t.getWeight());
        System.out.println(t.getEating());
        System.out.println(t.getRunning());
        t.sound();
    }
}

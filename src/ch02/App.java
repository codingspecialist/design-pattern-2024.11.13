package ch02;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        DoormanProxy proxy = new DoormanProxy(doorman);

        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        proxy.쫓아내(cat);
        proxy.쫓아내(mouse);
    }
}

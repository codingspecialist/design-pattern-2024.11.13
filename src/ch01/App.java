package ch01;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        doorman.쫓아내(cat);
        doorman.쫓아내(mouse);
    }
}

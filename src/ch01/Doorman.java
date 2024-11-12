package ch01;

// SRP -> Single Responsibility Principle
public class Doorman {

    // DIP -> Dependency Inversion Principle.
    public void 쫓아내(Animal a){
        System.out.println(a.getName()+" 쫓아내");
    }
}

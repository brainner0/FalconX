public class LiskovSubstitutionCorreta {

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        NonFlyingBird ostrich = new Ostrich();
        ostrich.walk();
    }
}

// Interface para aves que voam
interface FlyingBird {
    void fly();
}

// Interface para aves que não voam
interface NonFlyingBird {
    void walk();
}

// Implementação para um pássaro que voa
class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Implementação para um pássaro que não voa
class Ostrich implements NonFlyingBird {
    public void walk() {
        System.out.println("Ostrich is walking");
    }
}




public class LiskovSubstitutionCorreta {

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        NonFlyingBird ostrich = new Ostrich();
        ostrich.walk();
    }
}

interface FlyingBird {
    void fly();
}

interface NonFlyingBird {
    void walk();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Ostrich implements NonFlyingBird {
    public void walk() {
        System.out.println("Ostrich is walking");
    }
}




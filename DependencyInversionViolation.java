public class DependencyInversionViolation  {
    public static void main(String[] args) {
        Switch lightSwitch = new Switch(new LightBulb());
        lightSwitch.turnOn();
        lightSwitch.turnOff();

        Switch fanSwitch = new Switch(new Fan());
        fanSwitch.turnOn();
        fanSwitch.turnOff();
    }
}
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}




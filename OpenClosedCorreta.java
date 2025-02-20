public class OpenClosedCorreta {

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        DiscountStrategy discount = new VipDiscount();
        System.out.println("Discount: " + calculator.calculateDiscount(discount, 200));
    }
}

interface DiscountStrategy {
    double applyDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}

class VipDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}

class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.applyDiscount(amount);
    }


}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print() { System.out.println("Printing..."); }
    public void scan() { System.out.println("Scanning..."); }
    public void fax() { System.out.println("Faxing..."); }
}

public class InterfaceSegregationResolved {
    public static void main(String[] args) {
        Printer printer = new MultiFunctionPrinter();
        printer.print();
    }
}

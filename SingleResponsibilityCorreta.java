public class SingleResponsibilityCorreta {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);
    }
}

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }

}

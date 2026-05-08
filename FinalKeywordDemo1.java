// final class: cannot be inherited
final class SecureBankSystem {

    // final variable: constant value
    final double INTEREST_RATE = 7.5;

    // normal method
    void displayRate() {
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
    }

    // final method: cannot be overridden
    final void showSecurityMessage() {
        System.out.println("This system is highly secured.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {

        SecureBankSystem bank = new SecureBankSystem();

        bank.displayRate();
        bank.showSecurityMessage();

        // INTEREST_RATE = 8.0; // ❌ Error: cannot change final variable
    }
}

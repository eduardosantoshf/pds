package lab08_01;

public class Person {
    private String name;
    private BankAccount bankAccount;

    public Person(String n) {
        name = n;
        bankAccount = new BankAccountImpl("PeDeMeia", 0);
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return new Proxy((BankAccountImpl) bankAccount);
    }
}
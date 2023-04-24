import java.util.ArrayList;

public class Client {
    private final int id;
    private String name, occupation, address;
    private int age;
    private final String gender;
    private ArrayList<Account> accounts;

    public Client(int id, String name, String occupation, String address, int age, String gender) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public void createAccount() {

    }

    public void requestLoan(Account account) {

    }
}

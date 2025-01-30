import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Account implements AccountService {
    private int balance = 0;
    private final List<Transaction> transactions = new ArrayList<>();
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Ajouter un dépôt avec une date spécifique
    public void deposit(int amount, LocalDate date) {
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }

    // Ajouter un retrait avec une date spécifique
    public void withdraw(int amount, LocalDate date) {
        balance -= amount;
        transactions.add(new Transaction(date, -amount, balance));
    }

    @Override
    public void deposit(int amount) {
        deposit(amount, LocalDate.now()); // Utilisation de la date du jour si aucune date spécifique
    }

    @Override
    public void withdraw(int amount) {
        withdraw(amount, LocalDate.now());
    }

    @Override
    public void printStatement() {
        System.out.println("Date       || Amount  || Balance");

        // Trier les transactions par date décroissante
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getDate).reversed())
                .forEach(transaction -> System.out.printf("%-10s || %-8d || %-8d\n",
                        transaction.getDate().format(DATE_FORMATTER),
                        transaction.getAmount(),
                        transaction.getBalance()));
    }
}

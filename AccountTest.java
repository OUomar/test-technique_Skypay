import org.testng.annotations.Test;
import java.time.LocalDate;

public class AccountTest {
    @Test
    public void should_print_statement_correctly() {
        Account account = new Account();

        // Ajouter des transactions avec des dates spécifiques
        account.deposit(1000, LocalDate.of(2012, 1, 10));
        account.deposit(2000, LocalDate.of(2012, 1, 13));
        account.withdraw(500, LocalDate.of(2012, 1, 14));

        // Imprimer le relevé de compte
        account.printStatement();
    }
}

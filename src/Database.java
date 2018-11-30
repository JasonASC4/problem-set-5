import java.io.BufferedReader;
import java.io.FileReader;

/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader (new FileReader("accounts-db.text"))) {
			
		}

}
}
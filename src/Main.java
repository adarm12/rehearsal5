import java.util.Scanner;

public class Main {
    public static final int CREATE_NEW_ACCOUNT = 1;
    public static final int LOG_IN_TO_EXITS_ACCOUNT = 2;
    public static final int LOG_OFF = 3;

    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            System.out.println("Enter your choice: \n" +
                    CREATE_NEW_ACCOUNT + " - Create new account.\n" +
                    LOG_IN_TO_EXITS_ACCOUNT + " - Log in to exits account.\n" +
                    LOG_OFF + " - Log off. ");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case CREATE_NEW_ACCOUNT:
                    store.createUse();
                    break;
                case LOG_IN_TO_EXITS_ACCOUNT:
                    break;
                case LOG_OFF:
                    break;
            }

        } while (userChoice != LOG_OFF);
    }
}

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Store {
    private static final int PASSWORD_LENGTH = 6;
    private static final String YES_WORKER = "yes";
    private static final String NOT_WORKER = "no";
    private static final String YES_CLUB_MEMBER = "yes";
    private static final String NOT_CLUB_MEMBER = "no";
    private static final int REGULAR_WORKER = 1;
    private static final int MANAGER = 2;
    private static final int MANAGEMENT_TEAM_MEMBER = 3;


    private Client[] clients;
    private Worker[] workers;
    private Cart[] carts;

    public Store() {
        this.clients = new Client[0];
        this.workers = new Worker[0];
        this.carts = new Cart[0];
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {

        this.workers = workers;
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }

    public void createUse() {
        Scanner scanner = new Scanner(System.in);
        boolean isWorker = false;
        String clientOrWorker;
        boolean isValidName;
        String name;
        boolean isValidLastName;
        String lastName;
        boolean isValidUserName;
        String userName;
        boolean isValidPassword;
        String password;
        boolean isClubMember;
        String clubMember;
        int rank;

        do {
            System.out.println("Are worker? \n" +
                    "Enter yes or no.");
            clientOrWorker = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (clientOrWorker.equals(YES_WORKER)) {
                isWorker = true;
            }
            if (clientOrWorker.equals(NOT_WORKER)) {
                isWorker = false;
            }
        } while (!(clientOrWorker.equals(YES_WORKER)) && !(clientOrWorker.equals(NOT_WORKER)));

        do {
            System.out.println("Enter your firs name: ");
            name = scanner.nextLine();
        } while (!validName(name));

        do {
            System.out.println("Enter your last name: ");
            lastName = scanner.nextLine();
        } while (!validName(lastName));

        do {
            System.out.println("Enter user name: ");
            userName = scanner.nextLine();
        } while (!validName(userName));

        if (!isWorker) {
            do {
                System.out.println("Are you club member? ");
                clubMember = scanner.nextLine();
                if (clubMember.equals(YES_CLUB_MEMBER)) {
                    isClubMember = true;
                }
                if (clubMember.equals(NOT_CLUB_MEMBER)) {
                    isClubMember = false;
                }
            } while (!(clubMember.equals(YES_CLUB_MEMBER)) && !(clubMember.equals(NOT_CLUB_MEMBER)));

        }

        if (isWorker) {
            do {
                System.out.println("Enter your rank: \n" +
                        REGULAR_WORKER + " - For regular worker.\n" +
                        MANAGER + " - For manager.\n" +
                        MANAGEMENT_TEAM_MEMBER + " - For member on the management team.");
                rank = scanner.nextInt();
            } while ((rank != REGULAR_WORKER) && (rank != MANAGER) && (rank != MANAGEMENT_TEAM_MEMBER));
        }
    }

    public boolean validName(String name) {
        boolean isValidName = true;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                isValidName = false;
            }
        }
        return isValidName;
    }

    public boolean validLastName(String lastName) {
        boolean isValidLastName = true;
        for (int i = 0; i < lastName.length(); i++) {
            if (Character.isDigit(lastName.charAt(i))) {
                isValidLastName = false;
            }
        }
        return isValidLastName;
    }

    public boolean validUserName(String userName) {
        boolean isValidUserName = true;
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i].getUserName().equals(userName)) {
                isValidUserName = false;
            }
        }
        return isValidUserName;
    }

    public boolean validPassword(String password) {
        boolean isValidPassword = true;
        if (password.length() != PASSWORD_LENGTH) {
            isValidPassword = false;
        }
        return isValidPassword;
    }

}

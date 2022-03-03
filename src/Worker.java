import java.util.Date;

public class Worker extends Client{

    private int rank;

    public Worker(String name, String lastName, String userName, String password, boolean isClubMember, int purchasesNumber, int purchasesPrice, boolean isWorker, Date lastPurchaseDate, int rank) {
        super(name, lastName, userName, password, isClubMember, purchasesNumber, purchasesPrice, isWorker, lastPurchaseDate);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }




}

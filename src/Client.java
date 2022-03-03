import java.util.Date;

public class Client{
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private boolean isClubMember;
    private int purchasesNumber;
    private int purchasesPrice;

    public Client(String name, String lastName, String userName, String password, boolean isClubMember, int purchasesNumber, int purchasesPrice, boolean isWorker, Date lastPurchaseDate) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.isClubMember = isClubMember;
        this.purchasesNumber = purchasesNumber;
        this.purchasesPrice = purchasesPrice;
        this.isWorker = isWorker;
        this.lastPurchaseDate = lastPurchaseDate;
    }

    private boolean isWorker;
    private Date lastPurchaseDate;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isClubMember() {
        return isClubMember;
    }

    public void setClubMember(boolean clubMember) {
        isClubMember = clubMember;
    }

    public int getPurchasesNumber() {
        return purchasesNumber;
    }

    public void setPurchasesNumber(int purchasesNumber) {
        this.purchasesNumber = purchasesNumber;
    }

    public int getPurchasesPrice() {
        return purchasesPrice;
    }

    public void setPurchasesPrice(int purchasesPrice) {
        this.purchasesPrice = purchasesPrice;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public Date getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Date lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }
}

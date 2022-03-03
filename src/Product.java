public class Product {
    private String productName;
    private boolean isInStock;
    private int price;
    private int discount;

    public Product(String productName, boolean isInStock, int price, int discount) {
        this.productName = productName;
        this.isInStock = isInStock;
        this.price = price;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }






}

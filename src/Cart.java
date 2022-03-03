public class Cart {
    private Product[] products;
    private int cartPrice;


    public Cart(Product[] products, int cartPrice) {
        this.products = new Product[0];
        this.cartPrice = 0;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(int cartPrice) {
        this.cartPrice = cartPrice;
    }




}

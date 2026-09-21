package store.model;

public class Cart {
    private String id;
    private Product[] products;
    private double price;

    public String getId() {
        return id;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void definePrice() {
        if(products == null) {
            price = 0;
            return;
        }

        for (int i = 0; i < products.length; i++) {
            price += products[i].getPrice();
        }
    }
}

package store;

import store.model.Cart;
import store.model.Product;

public class Store {
    static void main() {
        final Product product0 = new Product();
        product0.setId("001");
        product0.setName("Product 0");
        product0.setPrice(10.0);

        final Product product1 = new Product();
        product1.setId("002");
        product1.setName("Product 1");
        product1.setPrice(20.0);

        final Product product2 = new Product();
        product2.setId("003");
        product2.setName("Product 2");
        product2.setPrice(30.0);

        Product[] products = new Product[3];
        products[0] = product0;
        products[1] = product1;
        products[2] = product2;

        final Cart cart0 = new Cart();
        cart0.setId("004");
        cart0.setProducts(products);
        cart0.definePrice();
        System.out.println("The total price: " + cart0.getPrice());

    }
}

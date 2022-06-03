public class Main {
    public static void main(String[] args) {
        // Field and Attribute == Alan ve nitelikler

        Product product = new Product();
        product.name = "Laptop";
        product.description = "Asus";
        product.id = 1;
        product.price = 17.000;
        product.stcokAmount = 54;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}

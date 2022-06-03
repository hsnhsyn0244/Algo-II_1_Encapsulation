public class Main {
    public static void main(String[] args) {
        // Encapsulation --> Kapsülleme ( Gruplama )

        Product product = new Product();
        product.setId(1234);
        product.setDescription("Hp Bilgisayar");
        product.setPrice(17.000);
        product.setName("Laptop");
        product.setStockAmount(45);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}

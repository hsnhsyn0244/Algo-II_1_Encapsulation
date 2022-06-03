public class Main {
    public static void main(String[] args) {
        // Constructor --> kurucu, yapıcı blok
        /*
            *Yapıcı blok class ın adı ile oluşur başka sekilde oluşmaz bir metod görevi görür
         */

        Product product = new Product(12,"Laptop","Hp Bilgisayar",17.000,54,"Gümüş Gri");
        /*
        product.setId(1234);
        product.setDescription("Hp Bilgisayar");
        product.setPrice(17.000);
        product.setName("Laptop");
        product.setStockAmount(45);
        */


        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}

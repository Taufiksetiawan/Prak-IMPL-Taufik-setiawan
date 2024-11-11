import java.util.Scanner;

public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void displayProduct() {
        view.displayProductInfo(model.getName(), model.getPrice(), model.getStock());
    }

    public void processPurchase() {
        Scanner in = new Scanner(System.in);

        view.displayPurchaseTransaction();
        System.out.print("Jumlah barang : ");
        int qty = in.nextInt();

        if (qty > model.getStock()) {
            System.out.println("Stok tidak mencukupi.");
        } else {
            model.reduceStock(qty);
            int totalPayment = qty * model.getPrice();
            view.displayTotalPayment(totalPayment);
        }

        displayProduct();  // Display updated stock after purchase
        in.close();
    }

    public void setProductName(String name) {
        model.setName(name);
    }

    public void setProductPrice(int price) {
        model.setPrice(price);
    }

    public void setProductStock(int stock) {
        model.setStock(stock);
    }
}

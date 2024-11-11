public class Kasir {
    public static void main(String[] args) {
        // Initialize model with product data
        Product model = new Product("GeForce GTX 1060Ti", 3000, 10);

        // Initialize view
        ProductView view = new ProductView();

        // Initialize controller
        ProductController controller = new ProductController(model, view);

        // Display initial product information
        controller.displayProduct();

        // Process a purchase transaction
        controller.processPurchase();
    }
}

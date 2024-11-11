public class ProductView {
    public void displayProductInfo(String name, int price, int stock) {
        System.out.println("Nama Barang : " + name);
        System.out.println("Harga Barang : " + price);
        System.out.println("Stok Barang : " + stock);
    }

    public void displayTotalPayment(int total) {
        System.out.println("Jumlah Bayar : " + total);
    }

    public void displayPurchaseTransaction() {
        System.out.println("Transaksi Pembelian");
    }
}

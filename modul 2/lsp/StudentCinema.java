class StudentCinema {
    private double generalPrice;

    public StudentCinema(double generalPrice) {
        this.generalPrice = generalPrice;
    }

    public double calculateAdminFee() {
        return (2.0 / 100.0) * generalPrice; // Menghitung 2% dari harga umum
    }

    public double getTotalPrice() {
        return generalPrice + calculateAdminFee(); // Total harga dengan biaya admin
    }

    public double getGeneralPrice() {
        return generalPrice;
    }
}
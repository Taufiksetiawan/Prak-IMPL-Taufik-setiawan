package tugas;
public class Tugas1 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0); // Pembagian dengan nol
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}

package tugas;
// File: MainApplication.java
public class MainApplication {
    public static void main(String[] args) {
        // Membuat window utama
        Window mainWindow = new Window("Main Window");
        mainWindow.open();
        
        // Membuat beberapa shape
        Rectangle rect = new Rectangle(50, 30);
        Circle circle = new Circle(20);
        Polygon triangle = new Polygon();
        
        // Menambahkan points untuk triangle
        triangle.addPoint(new Point(0, 0));
        triangle.addPoint(new Point(30, 0));
        triangle.addPoint(new Point(15, 25));
        
        // Menambahkan shapes ke window
        mainWindow.addShape(rect);
        mainWindow.addShape(circle);
        mainWindow.addShape(triangle);
        
        // Menampilkan window dengan shapes
        mainWindow.display();
        
        // Membuat dan menampilkan dialog box
        DialogBox dialog = new DialogBox("Sample Dialog");
        dialog.open();
        
        // Membuat console window
        ConsoleWindow console = new ConsoleWindow("Debug Console");
        console.open();
        
        // Contoh handling event
        Event clickEvent = new Event("MOUSE_CLICK");
        mainWindow.handleEvent(clickEvent);
    }
}
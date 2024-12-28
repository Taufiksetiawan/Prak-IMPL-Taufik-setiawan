package tugas;
// File: Window.java
import java.util.ArrayList;
import java.util.List;

class Window extends Frame {
    private List<Shape> shapes;
    private boolean isOpen;
    private DrawingContext drawingContext;
    
    public Window(String title) {
        super(title);
        shapes = new ArrayList<>();
        drawingContext = new DrawingContext();
        isOpen = false;
    }
    
    public void open() {
        isOpen = true;
        System.out.println("Window '" + title + "' opened");
    }
    
    public void close() {
        isOpen = false;
        System.out.println("Window '" + title + "' closed");
    }
    
    public void move() {
        System.out.println("Moving window to position: " + x + ", " + y);
    }
    
    public void display() {
        if (!isOpen) {
            System.out.println("Cannot display: window is not open");
            return;
        }
        
        System.out.println("Displaying window '" + title + "'");
        System.out.println("Window size: " + width + "x" + height);
        System.out.println("Contents:");
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    
    public void handleEvent(Event event) {
        System.out.println("Handling event: " + event.getEventType());
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
}
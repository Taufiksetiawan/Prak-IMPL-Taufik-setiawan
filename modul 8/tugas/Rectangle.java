package tugas;
// File: Rectangle.java
class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + position.x + "," + position.y + 
                          ") with width=" + width + " and height=" + height);
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }
    
    @Override
    public void move(Point newPosition) {
        this.position = newPosition;
        System.out.println("Moving Rectangle to (" + position.x + "," + position.y + ")");
    }
    
    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
        System.out.println("Resizing Rectangle by factor " + factor);
    }
}
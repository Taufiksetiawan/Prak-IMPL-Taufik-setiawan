package tugas;
// File: Shape.java
abstract class Shape {
    protected Point position;
    protected String color;
    
    public Shape() {
        this.position = new Point(0, 0);
        this.color = "black";
    }
    
    public abstract void draw();
    public abstract void erase();
    public abstract void move(Point newPosition);
    public abstract void resize(double factor);
    
    public void setColor(String color) {
        this.color = color;
    }
}
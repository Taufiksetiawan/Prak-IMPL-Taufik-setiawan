package tugas;
// File: Circle.java
class Circle extends Shape {
    private float radius;
    private Point center;
    
    public Circle(float radius) {
        super();
        this.radius = radius;
        this.center = new Point(0, 0);
    }
    
    public double maxInRadius(float radius) {
        return radius * 2;
    }
    
    public double circum() {
        return 2 * Math.PI * radius;
    }
    
    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle at center (" + center.x + "," + center.y + 
                          ") with radius=" + radius);
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
    
    @Override
    public void move(Point newPosition) {
        this.center = newPosition;
        this.position = newPosition;
        System.out.println("Moving Circle to (" + position.x + "," + position.y + ")");
    }
    
    @Override
    public void resize(double factor) {
        this.radius *= factor;
        System.out.println("Resizing Circle by factor " + factor);
    }
}
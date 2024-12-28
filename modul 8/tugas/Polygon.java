package tugas;
// File: Polygon.java
import java.util.ArrayList;
import java.util.List;

class Polygon extends Shape {
    private List<Point> vertices;
    
    public Polygon() {
        super();
        vertices = new ArrayList<>();
    }
    
    public void addPoint(Point point) {
        vertices.add(point);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Polygon with " + vertices.size() + " vertices");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println("Vertex " + i + ": (" + vertices.get(i).x + "," + vertices.get(i).y + ")");
        }
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing Polygon");
    }
    
    @Override
    public void move(Point newPosition) {
        Point oldPosition = this.position;
        int dx = newPosition.x - oldPosition.x;
        int dy = newPosition.y - oldPosition.y;
        
        for (Point vertex : vertices) {
            vertex.x += dx;
            vertex.y += dy;
        }
        this.position = newPosition;
        System.out.println("Moving Polygon to (" + position.x + "," + position.y + ")");
    }
    
    @Override
    public void resize(double factor) {
        for (Point vertex : vertices) {
            vertex.x = (int)(vertex.x * factor);
            vertex.y = (int)(vertex.y * factor);
        }
        System.out.println("Resizing Polygon by factor " + factor);
    }
}
package tugas;
// File: DrawingContext.java
class DrawingContext {
    private String currentColor;
    private int screenWidth;
    private int screenHeight;
    
    public DrawingContext() {
        this.currentColor = "black";
        this.screenWidth = 1024;
        this.screenHeight = 768;
    }
    
    public void setPaint(String color) {
        this.currentColor = color;
        System.out.println("Paint color set to: " + color);
    }
    
    public void clearScreen() {
        System.out.println("Screen cleared");
    }
    
    public int getVerticalSize() {
        return screenHeight;
    }
    
    public int getHorizontalSize() {
        return screenWidth;
    }
}
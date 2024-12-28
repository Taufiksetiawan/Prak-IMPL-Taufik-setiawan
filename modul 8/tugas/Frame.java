package tugas;
// File: Frame.java
abstract class Frame {
    protected String title;
    protected int x, y;
    protected int width, height;
    
    public Frame(String title) {
        this.title = title;
        this.x = 0;
        this.y = 0;
        this.width = 800;
        this.height = 600;
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
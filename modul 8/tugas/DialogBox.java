package tugas;
// File: DialogBox.java
class DialogBox extends Window {
    private DataController controller;
    private String message;
    
    public DialogBox(String title) {
        super(title);
        this.controller = new DataController();
        this.message = "";
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Dialog Message: " + message);
    }
}
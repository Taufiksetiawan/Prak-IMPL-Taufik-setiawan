package tugas;
// File: ConsoleWindow.java
import java.util.ArrayList;
import java.util.List;

class ConsoleWindow extends Window {
    private List<String> consoleOutput;
    
    public ConsoleWindow(String title) {
        super(title);
        consoleOutput = new ArrayList<>();
    }
    
    public void println(String message) {
        consoleOutput.add(message);
        System.out.println("[Console] " + message);
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Console Output:");
        for (String line : consoleOutput) {
            System.out.println(line);
        }
    }
}
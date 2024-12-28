package tugas;
// File: DataController.java
import java.util.ArrayList;
import java.util.List;

class DataController {
    private List<String> data;
    
    public DataController() {
        data = new ArrayList<>();
    }
    
    public void addData(String item) {
        data.add(item);
    }
    
    public List<String> getData() {
        return new ArrayList<>(data);
    }
    
    public void clearData() {
        data.clear();
    }
}
package tugas;
// File: Event.java
class Event {
    private String eventType;
    private long timestamp;
    
    public Event(String eventType) {
        this.eventType = eventType;
        this.timestamp = System.currentTimeMillis();
    }
    
    public String getEventType() {
        return eventType;
    }
    
    public long getTimestamp() {
        return timestamp;
    }
}
public class Course {
    private String courseName;
    private String courseId;
    private String courseCategory;

    public String getId() {
        // Mengembalikan nilai id Course
        return courseId;
    }

    public void setId(String id) {
        // Set id Course
        this.courseId = id;
    }

    public String getName() {
        // Mengembalikan Nama Course
        return courseName;
    }

    public void setName(String name) {
        // Set Nama Course
        this.courseName = name;
    }

    public String getCategory() {
        // Mengembalikan kategori Course
        return courseCategory;
    }

    public void setCategory(String category) {
        // Set Kategori Course
        this.courseCategory = category;
    }
}

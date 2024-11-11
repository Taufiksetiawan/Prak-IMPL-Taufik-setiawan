public class MVCPatternDemo {
    public static void main(String[] args) {
        // fetch course record based on its id from the database
        Course model = retrieveCourseFromDatabase();

        // Create a view: to display course details on console
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);

        controller.updateView();

        // update model data
        controller.setCourseName("Python");
        System.out.println("\nAfter updating, Course Details are as follows");
        controller.updateView();
    }

    private static Course retrieveCourseFromDatabase() {
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}

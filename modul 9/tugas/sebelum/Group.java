package sebelum;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {

    // Simulate persistence path for demonstration
    private String persistencePath() {
        return "./data"; // Replace with your actual directory path
    }

    // Gets users sorted by the most recently registered user
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        if (!new File(persistencePath()).exists())
            return users;
        File[] files = new File(persistencePath()).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    users.add(new User(file.getName(), this));
                }
            }
        }
        Collections.sort(users, new User.UserComparatorByDescendingRegistration());
        return users;
    }

    public static void main(String[] args) {
        Group group = new Group();

        // Create dummy directory for demonstration
        new File("./data").mkdirs(); // Create root folder
        new File("./data/user1").mkdirs(); // Simulate user1 folder
        new File("./data/user2").mkdirs(); // Simulate user2 folder

        List<User> users = group.getUsers();
        for (User user : users) {
            System.out.println("User: " + user.getName());
        }
    }
}

class User {
    private String name;
    private Group group;

    public User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    // Comparator to sort users by descending registration
    public static class UserComparatorByDescendingRegistration implements Comparator<User> {
        @Override
        public int compare(User u1, User u2) {
            return u2.getName().compareTo(u1.getName()); // Simulate descending order by name
        }
    }
}

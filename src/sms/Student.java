package sms;

public class Student {
    private final int id;
    private final String name;
    private double grade;

    public Student(int id, String name) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be blank.");
        }
        this.id = id;
        this.name = name.trim(); 
        this.grade = 0.0; // default grade here
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 100.0) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.grade = grade;
    }

    /** here it Prints: ID: <id> | Name: <name> | Grade: <grade> */
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }
}

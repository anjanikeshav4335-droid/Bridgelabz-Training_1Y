
class Student {
    String name;
    int rollNumber;
    double marks;
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }
    public void displayDetails() {
        System.out.println("Name " + name);
        System.out.println("Roll Number " + rollNumber);
        System.out.println("Marks " + marks);
        System.out.println("Grade " + calculateGrade());
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Krishna";
        student1.rollNumber = 101;
        student1.marks = 85.5;
        student1.displayDetails();
    }
}
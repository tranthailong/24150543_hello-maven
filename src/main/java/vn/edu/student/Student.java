package vn.edu.student;

public class Student {
    private String studentId;
    private String name;
    private String major;

    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("MSSV: " + studentId);
        System.out.println("Họ tên: " + name);
        System.out.println("Ngành: " + major);
    }
}
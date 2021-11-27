package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
    
    int id;
    int maxStudents;
    int registeredStudents;
    String courseName;
    Professor professor;
    ExamRoom room;
    Student[] students;
    
    
    public Exam(int id, int maxStudents, String courseName, Professor professor, ExamRoom room) {
        super();
        this.id = id;
        this.registeredStudents=0;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        students = new Student[maxStudents];
    }

    public void registerStudent(Student student) {
        System.out.println(students.length);
        if(this.registeredStudents<this.maxStudents) {
            students[this.registeredStudents]=student;
            this.registeredStudents++;
        }
    }
    
    public String toString() {
        return "id: " + this.id + "\n maxStudents: " + this.maxStudents + "\n courseName: " + this.courseName + "\n Professor: " + this.professor.name 
                + "\n room: " + this.room.getDescription() + " \nStudents: " + Arrays.toString(students);
    }

}

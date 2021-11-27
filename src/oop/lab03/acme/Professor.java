package oop.lab03.acme;

public class Professor implements User{
    
    int id;
    String name;
    String surname;
    String password;
    String[] courses;


    public Professor(int id, String name, String surname, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }
    
    public void replaceCourse(String course, int index) {
        this.courses[index]=course;
    }
    
    public void replaceAllCourses(String[] courses) {
        this.courses=courses;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }

}

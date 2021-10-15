package sef.FinalActivity;

public class Student extends Person{

    private String university;

    public Student() {
        System.out.println("I'm Person constructor");
    }
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    public void Introduce(){

        System.out.println("I study in " +university);
    }
}

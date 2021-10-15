package sef.FinalActivity;

public class Person {

    private String fName;
    private String lName;
    private int age;

    public Person(){
        System.out.println("I'm a Person Constructor");
    }

    public Person(String fName, String lName, int age) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    System.out.println("I'm Person_I constructor");
}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Introduce(){
        System.out.println("my name is " + fName + " " +lName);
        System.out.println("I am " + age + " years old");
    }
}

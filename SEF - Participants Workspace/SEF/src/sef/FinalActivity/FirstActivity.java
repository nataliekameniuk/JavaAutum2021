package sef.FinalActivity;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class FirstActivity {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setfName("John");
        employee.setlName("Doe");
        employee.setAge(25);
        employee.setCompany("Google");
        employee.setSalary(5000);
        employee.setJob("business analyst");
      System.out.println("-----------------------------");
     System.out.println("Employee's Name is   : " + employee.getfName());
     System.out.println("Employee's Name is   : " + employee.getlName());
    System.out.println("Employee's Age is    : " + employee.getAge());
     System.out.println("Employee's Title is  : " + employee.getCompany());
     System.out.println("Employee's Salary is : " + employee.getSalary());
     System.out.println("Employee's Job is : " + employee.getJob());

        Employee employee1 = new Employee();
        employee1.setfName("Jack");
        employee1.setlName("Plaskett");
        employee1.setAge(30);
        employee1.setCompany("Apple");
        employee1.setSalary(6000);
        employee1.setJob("developer");
   System.out.println("Employee's Name is   : " + employee1.getlName());
     System.out.println("Employee's Age is    : " + employee1.getAge());
     System.out.println("Employee's Title is  : " + employee1.getCompany());
     System.out.println("Employee's Salary is : " + employee1.getSalary());
     System.out.println("Employee's Job is : " + employee1.getJob());

        Employee employee2 = new Employee();
        employee2.setfName("Ben");
        employee2.setlName("Darrell");
        employee2.setAge(28);
        employee2.setCompany("Microsoft");
        employee2.setSalary(6500);
        employee2.setJob("designer");
     System.out.println("-----------------------------");
     System.out.println("Employee's Name is   : " + employee2.getfName());
    System.out.println("Employee's Name is   : " + employee2.getlName());
     System.out.println("Employee's Age is    : " + employee2.getAge());
     System.out.println("Employee's Title is  : " + employee2.getCompany());
    System.out.println("Employee's Salary is : " + employee2.getSalary());
   System.out.println("Employee's Job is : " + employee2.getJob());



        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        System.out.println("Sorting employees by top salary");

        employees.sort(Comparator.comparing(Employee::getSalary));
        for (int i = employees.size()-1; i>=0; i--){
        System.out.println("Employee's name is " + employees.get(i).getfName() + " "+ employees.get(i).getlName()
                + " and the salary is " + employees.get(i).getSalary());}

    }

    }




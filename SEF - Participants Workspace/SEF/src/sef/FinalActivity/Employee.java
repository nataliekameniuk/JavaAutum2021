package sef.FinalActivity;

public class Employee extends Person implements Comparable<Employee>{
    private String company;
    private String job;
    private int salary;

    public Employee() {
           System.out.println("I'm Employee constructor");
    }

        public String getCompany () {
            return company;
        }

        public void setCompany (String company){
            this.company = company;
        }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void Introduce(){

        System.out.println("I work as" +job +"in " + company + "and I make" + salary);
    }

  //  @Override
   // public String toString() {
   //     return "Employee{" +
   //             "company='" + company + '\'' +
   //             ", job='" + job + '\'' +
   //             ", salary=" + salary +
  //              '}';

 //   }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}



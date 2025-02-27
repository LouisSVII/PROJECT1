package Cashier;

/*String firstName 
String lastName 
int id 
int salary 
--------------------------------------------------------------------------------------------------------------- 
Cashier(id: int, firstName: String, lastName: String, job: String, salary: int) 
void increaseSalary (percent: double) //increases the salary of the cashier by a percentage 
*/

// CSCI 280
// Johnny Caulder
// Assignment 5
// 02/14

public class Cashier {
   private String firstName, lastName;
   private int id;
   double salary;
   
   // Getter
  public String getlastName() {
    return this.lastName;
  }

  // Setter
  public void setlastName(String lastName) {
    this.lastName = lastName;
  }
   // Getter
  public String getfirstName() {
    return this.firstName;
  }

  // Setter
  public void setfirstName(String firstName ) {
    this.firstName = firstName;
  } 
  // Getter
  public int getid() {
    return this.id;
  }

  // Setter
  public void setid(int id) {
    this.id = id;
  }
  
   // Getter
  public double getsalary() {
    return this.salary;
  }

  // Setter
  public void setsalary(double salary) {
    this.salary = salary;
  }
   
   public Cashier(int id, String firstName, String lastName, double salary){
   this.id = id;
   this.firstName = firstName;
   this.lastName = lastName;
   this.salary = salary;
   }

   public void increaseSalary (double percent){ //increases the salary of the cashier by a percentage
         salary = salary + (salary*percent)/100;
   }
   public static void main(String[] args) {
         Cashier a = new Cashier(0, "bob", "ban", 10);
         a.increaseSalary(20);
         System.out.printf("%.2f", a.getsalary());
   }
   }
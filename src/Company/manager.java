package Company;

// extends keyword to create a subclass of the Employee abstract class
abstract class manager extends Employee{
    //every child class must define the method
   public static void main(String[] args){
       manager Susy = new Manager();
       Susy.nameOfEmployee = "Susy";
       Susy.department = "Marketing";
       System.out.println(Susy.doWork());
   }



}

package Company;
//1. create an abstract class using the 'abstract' keyword
//2. this is how you define an abstract class
//3. Abstract classes cannot be instantiated (instantiation - to create an instance (an object) of that class
// create a subclass from the abstract and then instantiate the subclass
abstract class Employee {
    // define properties
    private String salary;
    public String nameOfEmployee;
    public String department;

    // if you dont define method in abstract class, you must mark it
    // abstract
//    public  abstract  String doWork();



    // if you define the method in abstract class you must
    // keyword is not needed
    public String doWork(){
        return "I am working";
    };
}


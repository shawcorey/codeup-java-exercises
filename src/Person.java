public class Person {
    //steps to define a person object
    //Properties live outside of methods
    private String name;
    public static void main(String[] args) {
    //Methods live under the properties *typically*
    //You can have multiple methods i.e; getName(), setName(), sayHello().
    //Main Method is used 90% of the time. Main Method is the starting point.
        //Lines 10 and 11 are pulling from the person class "template,blueprint". Makes a copy.
        Person person1 = new Person("");
        Person person2 = new Person("Vivian");
        person1.name = "Corey";
        person2.name = "Vivian";

        System.out.println(getName());
    }
    //These Methods can be called within the Main Method.
    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello Corey");
    }
}

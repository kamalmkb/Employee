public class Employee {
    String name;
    int age;
    String city;
    
    

    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
    
    public static void main(String args[]) {
        
        
        Employee first  = new Employee();
        Employee second  = new Employee();
        first.name = "kamal";
        second.name = "raj";
        first.age = 20;
        second.age = 87;
        first.city = "England";
        second.city = "Kolkata";
        

        first.display();
        second.display();
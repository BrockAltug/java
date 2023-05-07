package unit05.classes.oop.day21.gettersandsetters;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student(839281, "John", 3.8);
//        if a constructor is declared, Java won't provide one anymore
//        Student student2 = new Student();    //this wont work
        //call to the getId method to get the student 1's ID
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getGpa());
        //create new object for car and call to the getters from Car class
        Car car1 = new Car("Red",1998,150000);
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getMileage());
    }
}
class Pen{
  String color ;
  String type ;
  public void write(){ // method 1 
    System.out.println("writing something");
  }
  public void printColor(){ // method 2 
  System.out.println(this.color); // this helps method to know which object is trying to acess it . 
  }
} 
// creating a new class of name Student -->
class Student {
  String name ;
  int age ;

  public void printinfo(){ // METHOD
    System.out.println(this.name);
    System.out.println(this.age);
  }
  Student() {   // non parameterized constructor
    System.out.println("constructor called");
  }
  Student(String name , int age ) {   //  parameterized constructor
     this.name = name; // left name  is object of class and right name is argument which will be passed
     this.age = age ;
  }
}
public class Oops{
   public static void main(String [] args ) {
     Pen pen1 = new Pen(); // pen1 and pen2 are the objects created inside the main method
     pen1.color = "Blue";
     pen1.type = "Gel";
     Pen pen2 = new Pen();
     pen2.color = "black";
     pen2.type = "ballpoint";
     pen1.printColor();
     pen2.printColor();
 // for Student  class
     Student s1 = new Student("Ram" ,1000); // s1 is an object
    //  s1.name = "Parth"; we are already passing the arguments so we dont need to assign values
    //  s1.age = 19 ;  
     s1.printinfo();
     
  }
}
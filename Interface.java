//An interface is a completely "abstract class" 
//that is used to group related methods with empty bodies:
/**
 * Interface
 */
// interface Animals{
//     public void animalsound();// does not have a body 
//     public void run();


// }
/*
 * To access the interface methods,
 *  the interface must be "implemented" (kinda like inherited) 
 * by another class with the implements keyword (instead of extends). 
 * The body of the interface method is provided by the "implement" class:
 */
// class Pig  implements Animals {
//     public void animalsound(){
//         System.out.println("the pig say : wee wee");
//     }
//     public  void run(){
//         System.out.println("Zzz..");
//     }
// }

// /**
//  * Interface
//  */
// public class Interface {

//     public static void main(String[] args) {
//         Pig myPig = new Pig();
//         myPig.animalsound();
//         myPig.run();
//     }
// }


/*
 * 
 * 
 * 
 * interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
 


 */
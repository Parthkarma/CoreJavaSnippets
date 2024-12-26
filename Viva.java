// class A extends Thread{
//   public void run(){
//     for (int i = 0; i < 100; i++) {
//       System.out.print("Parth");
//       System.out.print(" ");
      
//     }
//   }
// }
// class B extends Thread{
//   public void run(){
//     for (int i = 0; i < 100; i++) {
//           System.out.print("Top");
//           System.out.print(" ");
//     }
//   }
// }
// public class Viva {

//   public static void main(String[] args) {
    
//          A a = new A();
//          B b = new B();
//          a.start();
//          b.start();
//   }
// }

import java.util.ArrayList;

public class Viva {

  public static void main(String[] args) {
    

    ArrayList<Integer> a = new ArrayList<>();
    a.add(22);
    a.add(23);
    a.add(50);
    a.add(100);
    for(int i = 0 ; i < a.size() ;i++){
      System.out.println(a.get(i));
    }

  }
}
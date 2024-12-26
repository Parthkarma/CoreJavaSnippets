import java.lang.*;
class t extends Thread
{                                     // run() belongs to library (java.lang)  & it can be called by obj.start()
    public void fun(){
       try {                                           // sleep -> delyas output by specified value 
        for(int i = 0 ; i<5;i++){
        System.out.println("parth");
        Thread.sleep(1000);
       }
       } catch (InterruptedException e) {
        
       }
    }
}
public class MultiThreading {
    public static void main(String[] args)  throws InterruptedException {
        t obj = new t();
        obj.fun();
        for (int i = 0; i < 5; i++) {
            System.out.println("karma");
            Thread.sleep(1000);
        }
    }
}
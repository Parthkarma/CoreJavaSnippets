abstract class car{
   abstract  public void drive();

    
    public void horn(){
        System.out.println("horn....");
    }
}
class tesla extends car {
   public void  drive(){
    System.out.println("drive...");
   }

}
public class abstractclass {

    public static void main(String[] args) {
        tesla c = new tesla();
        c.drive();
    }
}
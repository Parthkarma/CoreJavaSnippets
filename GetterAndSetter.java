class information{
    String name ;
    int ID;
   public void setname(String n){
     name = n ;
   System.out.println(name);
   }
   public String getname(){
     return name ;
   }
}

public class GetterAndSetter{
    public static void main(String[] args) {
        information student  = new information();
      student.name = " parth";
        student.ID = 22030;
        student.setname(student.name);
      System.out.println(student.getname());

    }
}
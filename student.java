class student {
    String name ; 
    int age;
student(String name , int age)
    {
        this.name = name ;
        this.age  = age ;
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        student s1 = new student("parth karma" , 19);
    }
} 
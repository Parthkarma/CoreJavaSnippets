class javafile{
    public static void main(String[] args) {
        String name = "parth";
        String AnotherName = "suresh";
        boolean y = name.equals(AnotherName);// return boolean 

System.out.println("it is : "+ y);
System.out.println("character at index : " +AnotherName.charAt(5));
System.out.println(name.concat("karma"));
System.out.println(name.toUpperCase());
System.out.println(name.substring(0, 5));
System.out.println(AnotherName.substring(0));
/*
 * This method has two variants and returns a
 *  new string that is a substring of this string.
 *  The substring begins with the character at the specified index and 
 * extends to the end of this string or up to endIndex – 1 if the second argument is given. 
 */

Integer num = new Integer(5);
 System.out.println(num);
 System.out.println(name.concat(AnotherName));

double a = 14.0 ; 
double b = 7.0 ; 
System.out.println(a/b);

}
}
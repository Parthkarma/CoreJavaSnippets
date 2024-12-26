import java.util.*;
class javaArraylist {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> list = new ArrayList<String>();
System.out.println("5 countries:");
for (int i = 1; i <= 5; ++i) {
String c = sc.nextLine();
list.add(c);
}
Collections.sort(list);
System.out.println("First country: " + list.get(0));
}
}
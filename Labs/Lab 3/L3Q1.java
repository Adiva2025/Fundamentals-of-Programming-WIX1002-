import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b, c;
        String z;

System.out.print("Enter two integer number: ");
a = sc.nextInt();
b = sc.nextInt();

System.out.print("Enter the operand: ");
z = sc.next();

char i = z.charAt(0);
switch (i) {
    case '+' :
     c = a + b;
     System.out.println(a + " + " + b + " = " + c);
     break;
    case '-' :
     c = a - b ;
     System.out.println(a + " - " + b + " = " + c);
     break;
    case '*' :
    c = a * b;
    System.out.println(a + " * " + b + " = " + c);
    break;
    case '/' :
    c =  a / b ;
    System.out.println(a + " / " + b + " = " + c);
    break;
    case '%' :
    c = a % b ;
    System.out.println(a + " % " + b + " = " + c);
    break;
   
}
sc.close();
    }
} 

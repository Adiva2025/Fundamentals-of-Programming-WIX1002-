package lab;

public class L6Q4 {
    public static int euclideanGCD(int a, int b) {
    if(a>b){
        if(a%b==0){
            return b;
        } else {
            return euclideanGCD(b, a%b);
        }
    }
    else {
        if(b%a==0){
            return a;
        }
         else {
            return euclideanGCD(a, b%a);
        }
    }
    }

  public static void main(String[] args) {
   System.out.println("GCD OF 24 and 8 : " + euclideanGCD(24, 8));
   System.out.println("GCD OF 200 and 625 : " + euclideanGCD(200, 625));
  }    
}

package lab;

public class L6Q6 {
    public static boolean prime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        
    }
    public static int reverse(int n){
        int reversed = 0;

        while(n>0){
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n = n/10;
        }

    return reversed;
    }

    public static boolean palindromicPrime(int n) {
      if( prime(n) && (n == reverse(n))) {
          return true;
      }
      else {
          return false;
      }
    }

    public static boolean emirp(int n) {
        if(prime(n) && (prime(reverse(n))) && (n != reverse(n))){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int palcount = 0;
        int emirpcount = 0;

        System.out.println("First 20 palindromic primes are: ");
        for(int i = 2; palcount < 20; i++) {
            if(palindromicPrime(i)) {
                System.out.print(i + " ");
                palcount++;
            }
        }
        System.out.println();
        System.out.println("First 20 Emirps are: ");
        for(int i = 2; emirpcount < 20; i++) {
            if(emirp(i)) {
                System.out.print(i + " ");
                emirpcount++;
            }
        }
    }
}

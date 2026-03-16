# Tutorial 6 Methods
-----

1. Write statements for each of the following:  
	a. Define a static method that returns the maximum number from 3 integer parameters. 
	```
    public static int(int a, int b, int c){
		if(a > b && a > c){
			return a;
		}
		else if ( b > a && b > c){
			return b; 
		}
		else {
			return c;
		}
	}
	``` 
	b. Define a static method that that determine whether the given integer is a square number.  
	```
    public static boolean square(int num){
		int low = 1;
		int high = num/2 + 1;

		while( low<=high){
			int mid = ( low + high ) / 2;
			if(mid*mid == num){
				return true;
			}
			else if ( mid*mid > num){
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return false;
	}
	``` 
	c. Define a static method that use to compute combination function `C(n,k)`.  `C(n,k)` gives the number of different k-element subsets that can be found in a given set of n elements. `C(n,k) = n! / (k! (n-k)!`  
	```
    public class combination{
	public static long factorial(int a) {
		long total = 1;
		for(int i = 1 ; i<=n ; i++) {
			total = total * i;
		}
		return total;
	}
	public static long combi (int n , int k){
		long nfactorial = factorial(n);
		long kfactorial = factorial(k);
		long nkfactorial = factorial(n-k);

		return nfactorial/ (kfactorial * nkfactorial);
	}
	public static void main(String[] args){
		int n = 4;
		int k = 2;

		long c = combi(n,k);
		System.out.println("C(" + n + "," + k + ") : " + c )
	}
	}
	```  
	d. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. `Pn = ½ n(3n -1)`  
	```
	public class pnumber{
		public static boolean isp(int num){
			int n = 1;
			int p = (n(3n -1))/2;

			while(p<=num){
				if(p==num){
					return true;
				}
				n++;
				p = (n(3n -1))/2;
			}
			return false;
		}
		public static void main(String[] args){
			int num = 12;
		if(isp.(num)){
			System.out.println(num + "is a pentagonal number");
		}

		else{
			System.out.println(num + "is not a pentagonal number");
		}
		}
	}
	``` 
	e. Define a static method that displays the number of letters and the number of digits of a String parameter.  
	```
    public static void ldsum(String s){
		int letters = 0;
		int digits = 0;

		for(int i = 0; i < s.length(); i++) {
			char c = s.chartAt(i);
			
			if(Charater.isLetter(c)){
				letters++;
			}
			else if(Character.isDigut(c)){
				digits++;
			}
		}
		System.out.Println("No. of Letter(s) : " + letters);
		System.out.Println("No. of Digit(s) : " + digits);
	}
	``` 
	f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method.  
	```
	
	import java.util.Random;

	public class quesf{
		 public static void main(String[] args){
			int[] randomnumlist = new int[10];
			generate(randomnumlist);

			System.out.print("Random numbers: ");
			for (int i = 0; i<10 ; i++){
				System.out.println(randomnumlist[i]);
			}
		 }

		 public static void generate(int[] randomnumlist ){
		    Random r = new Random();

			for( int i = 0; i< 10; i++){
				randomnumlist[i] = r.nextInt(101);
			}
		 }
	}
	``` 
	g. Define a static void method that returns the area and the circumference of a circle given the argument is radius. `Area = πr2` and `Circumference = 2 πr`. 

```
    public static void circle(double r){
		double area = 3.14 * r * r;
		double circumference = 2 * 3.14 * r;

		System.out.println("Radius = " + r);
		System.out.println("Area = " + area);
		System.out.println("Circumference = " + circumference);
	}

	public static void main(String[] args){
		double r = 5;

		circle(r);
	}
```  

	h. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice.

```
    import java.util.Random;

	public class Random {
		public static void main(String[] args){

		}

		public static int randomNumTwice(){
			Random r = new Random();
			boolean [] repeat = new repeat[11];

			while(true){
				int num = r.nextInt(11);

				if(repeat[num] == true){
					return num;
				}
				repeat[num] = true;
			}
		}
		public static void main(String[] args){
			int repeated = randomNumTwice();
			System.out.println("First repeated number : " + repeated)
		}
	}
```

2. Write a program that consists of a method that can display three numbers in decreasing order.

```
public class decreasing{
	public static void order(int a, int b, int c){
		if(a > b && a > c){
				if(b > c)
                System.out.println("Descending order : " + a + ", " + b + ", " + c);
            else
                System.out.println("Descending order : " + a + ", " + c + ", " + b);
       
		}
		else if(b > a && b > c){
            if(a > c)
                System.out.println("Desceding order : " + b + ", " + a + ", " + c);
            else
                System.out.println("Desceding order : " + b + ", " + c + ", " + a);
        	}
		else {
            if(a > b)
                System.out.println("Desceding order : " + c + ", " + a + ", " + b);
            else
                System.out.println("Desceding order : " + c + ", " + b + ", " + a);
    	 }

	}

	public static void main(String[] args){
		order(4, 7 ,9);
	}
}
``` 

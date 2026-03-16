
# WIX1002 Fundamentals of Programming
## Tutorial 4: Flow of Control (Repetition)


### 1. Write statements for each of the following

* a. Find the largest integer n so that $n^{3}$ is less than 2000. 
```
int n = 1;
while (n*n*n <= 2000) {
    n++;
}
n--;
System.out.println("Largest number: " + number);
```
* b. Display the square number of the first twelve integers starting from 1. 
```
for (int i = 1; i <= 12; i++) {
System.out.println(i + " squared = " + (i * i));
}
```
* c. Display a 4-by-5 matrix using random number within 0 to 100. 
```
Random r = new Random();
 int m = 4, n= 5;
 for(m=0; m<=4;m++) {
	for(n=0; n<=5; n++){
		int num = r.nextInt(101);
		System.out.print(number + "\t");
	}
	System.out.print();
 }
 ```
* d. Compute the sum of numbers from 1 to a given number. 
```
import java.util.Scanner;

Scanner s = new Scanner(System.in);
System.out.println("Enter a number; "  );
int n = s.nextInt();
int sum = 0;

for(int i = 1; i<= n; i++){
	sum += i,
}
System.out.println(" Sum : " + sum);
```

* e. Compute the sum of the series: 1/25+2/24+3/23 + ... + 25/1 in two decimal places. 
```
int a=1, b=25;
total = 0;
for(a=1;a<=25;a++) {
	m = (double)a/b;
	total += m;
	b--;
}
System.out.printf("%.2f" , total);

```

---

### 2. Correct the error for the following statements.



a. 
```java
for (x=10;x>0;x++)
	sum += x;
```
```
java
int sum = 0;
for (int x = 10; x>0; x--)
	sum += x;
```

b.
```java
do 
	x += 2;
	y += x; 
	System.out.println(x + " and " + y); 
while (x<100)
```
```
do {
	x += 2;
	y += x; 
 System.out.println(x + " and " + y); 
}
while (x<100);
```
c.
```java
for ( x==1, y==20 x < y, x++, y-=2);
	System.out.println(x & " " & y);
```
```
for (int x=1, y=20 x < y, x++, y-=2) {
	System.out.println(x + " " + y); 
	}
```
d.
```java
i=1;
while(i<10) {
	if (i=-10)
		System.out.println("Program End");
}
```
```
int i=1; //yahan hum assign kar rahai hain
while(i<10) {
	if (i==-10) //yahan hum equality de rahe hain
		System.out.println("Program End");
		break;
}
i++;

```
---
### 3. Write the statements that display the first ten values of the Fibonacci sequence.  

Given the formula $f_{1}=1$, $f_{2}=1$, $f_{n}=f_{n-1}+f_{n-2}$
```

int n = 10, n1 = 0, n2=1, n3;

for(int i=1; i<=n; i++ ){
	System.out.print(n1 + " ,");
	n3 = n1+ n2;
	n1 = n2;
	n2 = n3;
}


---
### 4. Write the statements that display the string in reverse order.

(use `String.length()` to get the length of the string)
```
import java.util.Scanner;

Scanner s = new Scanner(System.in);
System.out.print("Enter a string: ");
String G = s.nextLine();

for (int i = G.length() - 1; i >= 0; i--) {
	System.out.print(G.charAt(i));
}
System.out.println();

# Tutorial 5 Arrays

1.  Write statements for each of the following
    a.  Declare an array that used to store 12 floating point numbers.  
	```
    float [] array = new float[12];
	```
    b.  Initialize an array that used to store the value of A to E. 
	```
	char [] a = {'A','B','C','D','E'};
	``` 
    c.  Declare an array that used to store 100 students name. 
	```
    String[] name = new String[100];
	``` 
    d.  Declare an array for a table with 6 rows 2 columns that used to store integer value. 
	```
    int[][] matrix = new[6][2];
	``` 
    e.  Initialize an array with the following value:  
	```math
	\begin{pmatrix}
	6 & 9 \\
	2 & 5 \\
	4 & 6
	\end{pmatrix}
	```
	```
    int[][] matrix ={{6,9},{2,5},{4,6}};
	```

    f.  After initialize the array, modify the value of the above array to  
	```math
	\begin{pmatrix}
	6 & 9 \\
	2 & 4 \\
	3 & 7
	\end{pmatrix}
	```
	```
    matrix[1][1] = 4;
	matrix[2][0] = 3;
	matrix[2][1] = 7;
	
	```
    g.  Display all the values of an array name contact in separate lines.
```
for(int i = 0; i<contact.length(); i++){
	Ssyetm.out.println(contact[i]);
}


```
	---
    

2.  Correct the error for the following statements.   

	a.
	```java
	String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
	```
	```
	String[] code = {"AAA", "AAB", "AAC", "AAD"};
	```
	   
	  b.
	```java
	int[] num = new num[10]; 
	for(int k=0; k<=num.length(); k++) 
	sum+=num;
	```
	```
	int[] num = new int[10]; 
	int sum = 0;
	for(int k=0; k<=num.length; k++) 
	sum+=num[k];
	```
	c.
	```java
	int [][]t = new int[3][]; 
	t[1][2] = 5;
	```
	```
	int [][]t = new int[3][3]; 
	t[1][2] = 5;
	```
	d.
	```java
	int i = 4;
	int []score = new int[5];
	score[1] = 78;
	score[++i] = 100;
	```
	```
	int i = 4;
	int []score = new int[6];
	score[1] = 78;
	score[++i] = 100;
	```
 ---

3.  Determine the values of each element of array marks. Assume the array was declared as:  
    ```java
    int[] marks = new int[5];
    int i = 0, j = 1;
    marks[i] = 12;
    marks[j] = marks[i] + 19;
    marks[j-1] = marks[j] * marks[j];
    marks[j*3] = marks[i+1];
    marks[++j] = marks[i] % 5;
    marks[2*j] = marks[j-1];
    ```
```
marks[0] = 961
marks[1] = 31
marks[2] = 1
marks[3] = 31
marks[4] = 31

```
---

4.  Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.  

---
```
String[] sentence = {"Sometimes", "the", "best", "can","be","the","worst"}
int count =0;
for (int i =0 ; i<sentence.length; i++){
	if(sentence[i].equals("the")){
		count++;
	}
}
System.out.print("Number of 'the' : " + count);


```

5.  Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.  

---
```
String[] sentence = {"that", "cat", "is", "cute"}
 for(int i = sentence.length-1; i>=0 ;i--){
	String word = sentence[i];
	for(int j = word.length() -1 ; j>=0 ; j--){
		System.out.print(word.chartAt(j));
	}
	System.out.print(" ");
 }
```
6.  Write the statements that generate 1 random integer within 0-255. Convert the number to binary and store the bit into an 8-bit array. Then, display the binary number.  
```
Random r = new Random();
int num = r.nextInt(256);
int[] bits = new int[8];

for(int i = 7; i>=0 ; i--){
	bits[i] = num%2;
	num = num/2;
}

for(int i = 0; i<8; i++){
	System.out.print(bits[i]);
}
```

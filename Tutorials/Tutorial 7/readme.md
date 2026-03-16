# Tutorial 
# Tutorial 
## 1. Write statements for each of the following

### a.
Store ten random integers within 0 to 1000 to a text file named `integer.txt`.
```
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;

try{
PrintWriter pw = new PrintWriter(new file ("integer.txt"));
Random r = new Random();

for(int i = 0; int<10 ; i++){
    out.println(random.next(1001));}
out.close(); 
} catch(IOException a){
    System.out.println("Error found);
}
```
### b.
Read from the text file generated in a. Display all the integers and the largest integer.
```
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

try{
    Scanner s = new Scanner(new FielInputStream("integer.txt"));
    int max = Integer.MIN_VALUE;

    while(s.hasNextInt()){
        int num = s.nextInt();
        System.out.println(num);
        if(num > max){
            max = num;
        }
    }
    s.close();
    System.out.println("Largest integer: " + max);
}catch(IOException a){
    System.out.println("ERROR in file reading");
    }
```
### c.
Store ten random integers within 0 to 1000 to a binary file named `integer.dat`.

``` 
import java.io.*;
import java.util.Random;

Random r = new Random();
try{
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("integer.dat"));
}

    for(int i = 0 ; i< 10 ;i++){
        oos.writeInt(r.next(1001));
    }
    oos.close();

catch(IOException a) {
    System.out.println("ERROR");
}
```
### d.
Read from the binary file generated in c. Display all the integers and the average.
```
import java.io.*;

int sum = 0; 
int count = 0;

try{
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("integer.dat"));

    try{
        while(true) {
        int num = ois.readInt();
        System.out.println(num);
        sum = sum + num;
        count++;
        }
    }catch(EOFException e){

    }
    ois.close();

    double avg = (double) sum/count;
    System.out.println("Average :" + avg);
} catch(IOException e){
    System.out.println("ERROR");
}
```
---

## 2. Correct the error for the following statements
### a.
```java
PrintWriter out = new PrintWriter(new FileOutputStream("d:\data\matrix.txt"));
```
##### Answer:
``` java
PrintWriter out = new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
```
### b.
```java
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} 
catch (FileNotFoundException e) {
    System.out.println("Problem with file output");
}
```
##### Answer:
``` java
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));}

catch (FileNotFoundException e) {
    System.out.println("Problem with file output");
}
```
### c.
```java
int num;
Scanner a = new Scanner(new FileInputStream("data.dat"));
num = a.readInt();
a.close();
```
##### Answer:
``` java
try {
int num;
ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
num = a.nextInt();
a.close();
}catch (Exception ex) {
}
```
### d.
```java
ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.dat"));
o.print('A');
o.close();
```
##### Answer:
``` java
try {
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.writeUTF('A');
o.close();
}catch (Exception ex) {}
```

---

## 3.

Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.
##### Answer:
``` java

import java.io.*;
import java.util.Scanner;

Scanner s = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String line = s.nextLine();

try
    (PrintWriter pw = new PrintWriter(new FileWriter("data.txt"))) {

    for(int i =0; i<line.length(); i++){
        char c = line.charAt(i);
        int ascii = (int) c;
        String binary = Integer.toBinaryString(ascii);
        while(binary.length() < 8 ){
            binary = "0" + binary;
        }
        
        pw.print(binary + " ");

    }
}catch(IOException a ){
    System.out.println("ERRORRR");
}

try(Scanner s = new Scanner(new File("data.txt"))) {
    String restored = ""; 

    while(s.hasNext()){
        String binary = s.next();
        int ascii = Integer.parseInt(binary, 2);
        restored = restored + (char) ascii;
    }
    System.out.println("Restored sentence: " + restored);
}catch(IOException e){
    System.out.println("ERROR");
}

```
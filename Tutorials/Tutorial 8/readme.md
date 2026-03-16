# Tutorial 


# Tutorial 8

#### Adiva Zainab (25062742)

## Question 1 :

### Write statements for each of the following

### a. Define a class Student.
```java
class Student {
   //characteristics 
}
```

### b. Declare the instance variable that used to store contact number.
```java
private String contactNumber;
```

### c. Create the constructor that initializes the contact number to null. 
```java
public Student(){
    this.contactNumber = null;
}
```

### d. Create another constructor that assign the parameter value to the contact number.
```java
public Student(String Number){
    this.contactNumber = Number;
}
```

### e. Create an accessor and mutator method for the contact number.
```java
public String getContactNumber(){
    return this.contactNumber;
}

public void setContactNumber(String contactNumber){
    this.contactNumber = contactNumber;
}
```

### f. Create a method that used to display the contact number.
```java
public void print(){
    System.out.println("Contact Number : " + this.contactNumber);
}
```

### g. Create an object of the class Student.
```java
Student s1 = new Student();
```

### h. Change the contact number using the mutator method. 
```java
s1.setContactNumber("0123456789");
```

### i. Create an object of the class Animal. 
```java
Animal animal = new Animal();
```

### j. Create an object of the class Animal that used to represent a cat.
```java
Animal cat = new Animal();
```

### k. Create an object of the class Number with the value 20 and 40. 
```java
class Number{
    int value1 ;
    int value2 ;

    public Number(int x ,int y)
    value1 = x;
    value2 = y;
    }
    public static void main(String[] args){
        Number num = new Number(20,40);
    }


```


## Question 2 :

### Write statements for each of the following

### a. Define a class Digit.
```java
class Digit{

}
```

### b. Declare the instance variable that used to store a number.
```java
private int number;
```

### c. Create a constructor that assign the parameter value to the number. 
```java
public Digit(int num){
    this.number = num;
}
```

### d.  Create a digitMultiplication method that returns the multiplication of the number. If the number is 1345, the method will return 60.
```java
public int digitMulti() {
    int mul = 1; // multiplication
    int num = this.number; // temporary
    
    while(num > 0) {
        mul *= (num % 10);
        num /= 10;
    }
    
    return mul;
}
```

### e. Create a method that used to display the digit multiplication of the number.
```java
public void displayDigitMultiplication(){
    System.out.println(digitMultiplin);
}
```

### f. Create a tester class that displays the digit multiplication of 4567.
```java
public class Tester {
	public static void main(String[] args) {
		Digit d = new Digit(4567);
        d.displayDigitMultiplication();
	}
}
```


## Question 3 :

### Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, instance variables, accessor and mutator method and an output method that display the x-coordinate and  y-coordinate

```java
class Coordinate{
    private int x;
    private int y;

    public Coordinate(){
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void displayCoordinates() {
        System.out.println("X-coordinate: " + x + ", Y-coordinate: " + y);
    }
}
public class mainprog{
    public static void main(String[] args) {
        Coordinate a = new Cordinate(7,8);

        a.displayCoordinates();
    }

}
```


## Question 4 :

### Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. For cash payment, the class accepts the amount in cash; for cheque payment, the class accepts the amount and the cheque number; for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code. Use the same method name for the payment.
```java
// Payment class
class Payment {

    // Cash payment
    public void cashPayment(double amount) {
        System.out.println("Cash Payment of $" + amount + " completed.");
    }

    // Cheque payment
    public void chequePayment(double amount, String chequeNumber) {
        System.out.println("Cheque Payment of $" + amount + " completed.");
        System.out.println("Cheque Number: " + chequeNumber);
    }

    // Credit card payment
    public void creditcardPayment(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        System.out.println("Credit Card Payment of $" + amount + " completed.");
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Validation Code: " + validationCode);
    }
}

// Tester class
public class mainprog {
    public static void main(String[] args) {
        Payment payment = new Payment();

        // Cash payment
        payment.cashPayment(100.0);

        // Cheque payment
        payment.chequePayment(250.0, "CH1234567");

        // Credit card payment
        payment.creditcardPayment(500.0, "ABC", "Visa", "12/27", "12/3");
    }
}

```


## Question 5 :

### Create a class Connection. The Connection class keeps track of the number of connections to the server. Whenever an object is created, a connection is established. The class has a disconnect method and a display method that display the number of connections to the server.
```java
class Connection{
    private static int connectionCount = 0;

    public Connection(){
        connectionCount++;
        System.out.println("Connection established. Total connections: " + connectionCount);
    }
    public void disconnect() {
        
            connectionCount--;
            System.out.println("Connection disconnected. Total connections: " + connectionCount);
        } 
    public void displayConnections() {
        System.out.println("Number of connections to the server: " + connectionCount);
    }
    public class Tester {
    public static void main(String[] args) {
        // Create connections
        Connection c1 = new Connection(); 
        Connection c2 = new Connection(); 
       

        // Display connections
        c1.displayConnections(); 

        // Disconnect one connection
        c2.disconnect(); 

    }
    }
}

```
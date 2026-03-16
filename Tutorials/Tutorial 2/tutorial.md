
# WIX1002 Fundamentals of Programming
## Tutorial 2 Java Fundamental

1.  Display the sentence `Faculty of Computer Science and Information Technology`.  
    a.  In one line using multiple Java statements  
    ```
    System.out.print(“Faculty”); 
    System.out.print(“of”);
    System.out.print(“Computer”);
    System.out.print(“Science”);
    System.out.print(“and”);
    System.out.print(“Information”);
    System.out.print(“Technology.”);
    ```
    b.  In multiple lines using one Java statement  
    ```
    System.out.println(“Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology.”);
    ```

2.  Write a Java statement that print `"SDN" - Software-defined networking`
   
   ```
   System.out.println(“\“SDN\” – Software-defined networking”); 
   ```

3.  Correct the error for the following statements.  
    a.  `System.Println("Java Programming");` 
     ```
      System.out.println(“Java Programming”); 
     ```
    b.  `System.in.println("Introduction to Java!")`  
    ```
      System.out.println(“Introduction to Java!”);
    ```
    c.  `System.out.println("\t is the horizontal tab character");`  
    ```
      System.out.println(\\t is the horizontal tab character);
    ```
    d.  `system.out.println("Java is case sensitive!" );`  
    ```
      System.out.println(“Java is case sensitive!”);
    ```
    


4.  Write statements for each of the following  
    a.  Declare a variable that used to store the value of a matric number. 
    ```
    String matric number = “25062742”;
    ``` 
    b.  Declare a variable that used to store the value of $\pi$. 
    ```
    Double pi = 3.14;
    ```  
    c.  Initialize a variable named `M` with the value set to `false`.  
    ```
    boolean M = false;
    ``` 
    d.  Initialize a variable named `P` with the value set to `8800000000`.  
    ```
    Long P = 8800000000;
    ``` 
    e.  Initialize a variable named `letter` with the value set to `U`.  
    ```
    char letter = “U”;
    ``` 
    f.  Declare a constant variable named `PRO`. The value of the constant variable is `Java`.  
    ```
    final string PRO =  “ Java”;
    ``` 

5.  Correct the error for the following statements.
    a.
    ```
        final double AMOUNT ="32.5";  
        AMOUNT +=10;
        System.out.println("The amount is " + AMOUNT);
    ```
    ```
        double amount = 32.5; 
        amount += 10; 
        System.out.println("The amount is " + amount); 

    ```
    b.
    ```
    string chapter = 'Summary';  
    System.out.println(chapter);  
    ```
     ```
    String chapter =  “Summary”; 
    System.out.println(chapter); 
    ```
    c.
    ```
    int num;  
    ++num++;  
    num1 = num;  
    ```
     ```
     int num = 0 ; 
     int num1 ;
     ++num; 
     num1 = num; 
    ```
    d.
    ```
    int num = 3000;  
    System.out.printf("%4.2f\n", num);  
    ```
     ```
    int num = 3000; 
    System.out.printf("%4d\n", num); 
    
    ```
    e.
    ```
    String contact;  
    Scanner keyboard = new Scanner(System.out);  
    contact = keyboard.nextLine();  
    ```
     ```
    String contact; 
    Scanner keyboard = new Scanner(System.in); 
    contact = keyboard.nextLine(); 
    
    ```

6.  Write a java program that print the circumference of a circle. The input of the program is diameter.
    Display the result in three decimal places. (Note $\pi=$ Math.PI)
    ```text
    Enter diameter: 11.8
    The circumference of the circle is: 37.071
    ```
    ```
    Scanner sc = new Scanner(System.in);
    double diameter, 
    System.out.print(“ Enter diameter: ”);
    diameter = sc.nextDouble (11.8);
    circumference = diamaeter * Math.PI;
    
    ```

7.  Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters).
    Print the output in two decimal places.
    ```text
    Enter value in inch: 20.17
    20.17 inches = 0.51 meters
    ```
    ```
    Scanner input = new Scanner(System.in);
    System.out.print(“Enter value in inch; ”);
    double inch = input.nextDouble( );
    double meter = inch*0.0254;
    System.out.printf(%.2f inches = %.2f meters\n”, inch, meter);
    
    ```
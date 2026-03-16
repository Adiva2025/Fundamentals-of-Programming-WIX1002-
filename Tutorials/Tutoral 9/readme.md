# Tutorial 9

#### Adiva Zainab (25062742)

## Question 1 :

### Write statements for each of the following

### a. Write a static method compare that return true if two objects parameter (Student s, Teacher t) are belongs to the same class. Otherwise return false.
```java
public static boolean compare(Object s, Object t){
    return s.getClass() == t.getClass();
}
```

### b. Write a static method isClass that return true if the object parameter (Student s) is belong to any descendent class of Person. Otherwise return false.
```java
public static isClass(Object s){
   if (s instanceof Person) {
        return true;
    } else {
        return false;
    }
}
```

## Question 2 :

### Define a class Organism. The class contains the initial size of the organism and the growth rate. Create a constructor to initialize the instance variables. Then, define a class Animal. Animal is an organism that has extra instance variable which is the amount of eating need. Create a constructor to initialize the instance variable and a method to display the Animal instance variables.
```java
class Organism{
    public double size;
    public double growthRate;

    public Organism(int size, double growthRate){
        this.size = size;
        this.growthRate = growthRate;
    }
}

class Animal extends Organism{

    private double amountOfEatingNeed;

    public Animal(int size, double growthRate, double amountOfEatingNeed){
        super(size, growthRate);
        this.amountOfEatingNeed = 0;
    }

    public void display(){
        System.out.println("Initial Size: " + initialSize);
        System.out.println("Growth Rate: " + growthRate);
        System.out.println("Eating Amount: " + eatingAmount);}
}
```


## Question 3 :

### Define a class PaySystem. The class consists of the payrate per hour and the number of hours. The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. Derived a class SpecialPay from PaySystem that override the base method and return the total pay plus 30% commission.
```java
class PaySystem{
    public double payRatePerHour;
    public int numberOfHour;


    public PaySystem(double payRatePerHour, int numberOfHour){
        this.payRatePerHour = payRatePerHour;
        this.numberOfHour = numberOfHour;

    }

    public double calculateTotalPay(int numberOfHour){
        return this.payRatePerHour * numberOfHour;
    }

    public void getTotalPay(){
         System.out.println("Total Pay: " + calculateTotalPay());
    }
}

class RegularPay extends PaySystem{

    RegularPay(double payRatePerHour, int numberOfHour) {
        super(payRatePerHour, numberOfHour);
    }
}

class SpecialPay extends PaySystem{
    
    SpecialPay(double payRatePerHour, int numberOfHour) {
        super(payRatePerHour, numberOfHour);
    }

    @Override
    public double getTotalPay(){
        return super.getTotalPay() * 1.3;
    }
}
```


## Question 4 :

### Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. Besides the class consists of a method to compute the total price and a display method. Derived a class SugarPurchase from PurchaseSystem. This new class add a sugar weight attributed and override the method to compute the total price as (unit price \* quantity \* sugar weight).
```java
class PurchaseSystem{
    public String productCode;
    public double unitPrice;
    public int quantity;
    public double totalPrice;

    public PurchaseSystem(String productCode, double unitPrice, int quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double computeTotalPrice() {
        totalPrice = unitPrice * quantity;
        return totalPrice;
    }

    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + computeTotalPrice());
    }
}

class SugarPurchase extends PurchaseSystem {
    private double sugarWeight;

    public SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
        super(productCode, unitPrice, quantity);
        this.sugarWeight = sugarWeight;
    }

    @Override
    public double computeTotalPrice() {
        totalPrice = unitPrice * quantity * sugarWeight;
        return totalPrice;
    }
}
```

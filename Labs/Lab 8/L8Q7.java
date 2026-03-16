package lab;


class Money{
    private double amount;

    public Money(double amount){
        this.amount = amount;
        roundAmount();
        
    }
    private void roundAmount() {
        this.amount = Math.round(this.amount * 20.0) / 20.0;
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtract(Money other) {
        return new Money(this.amount - other.amount);
    }

    public void calculateNotesAndCoins() {
        double remaining = amount;
        System.out.println("Amount: RM" + String.format("%.2f", amount));

        int count100 = 0;
        while (remaining >= 100) {
            remaining -= 100;
            count100++;
        }
        System.out.println("RM100 note: " + count100);

        int count50 = 0;
        while (remaining >= 50) {
            remaining -= 50;
            count50++;
        }
        System.out.println("RM50 note: " + count50);

        int count10 = 0;
        while (remaining >= 10) {
            remaining -= 10;
            count10++;
        }
        System.out.println("RM10 note: " + count10);

        int count5 = 0;
        while (remaining >= 5) {
            remaining -= 5;
            count5++;
        }
        System.out.println("RM5 note: " + count5);

        int count1 = 0;
        while (remaining >= 1) {
            remaining -= 1;
            count1++;
        }
        System.out.println("RM1 note: " + count1);

       
        int count50c = 0;
        while (remaining >= 0.50) {
            remaining -= 0.50;
            count50c++;
        }
        System.out.println("50 cent coin: " + count50c);

        int count20c = 0;
        while (remaining >= 0.20) {
            remaining -= 0.20;
            count20c++;
        }
        System.out.println("20 cent coin: " + count20c);

        int count10c = 0;
        while (remaining >= 0.10) {
            remaining -= 0.10;
            count10c++;
        }
        System.out.println("10 cent coin: " + count10c);

        int count5c = 0;
        while (remaining >= 0.05) {
            remaining -= 0.05;
            count5c++;
        }
        System.out.println("5 cent coin: " + count5c);
    }
    
    public void displayAmount() {
        System.out.println("Amount: RM" + String.format("%.2f", amount));
    }
}

public class L8Q7 {
     public static void main(String[] args) {
        Money m1 = new Money(10.18);
        m1.calculateNotesAndCoins();

        Money m2 = new Money(9.37);
        m2.calculateNotesAndCoins();

        Money sum = m1.add(m2);
        System.out.print("After addition:" );
        sum.displayAmount();

        Money diff = m1.subtract(m2);
        System.out.print("After subtraction:" );
        diff.displayAmount();
  
    }
}

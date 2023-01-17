// write a program in java using class
public class Student {
    public static void main(String args[]) {
      System.out.println("Hello World");
    }
}

// write a java program using if else statement
public class IfElseExample {
    public static void main (String[] args){
        int number = 12;
        if(number>= 10){
            System.out.println("number: " + number);
        }
        else {
           System.out.println("No Data");
        }
    }
}


// Series of Prime Number up to 25
public class PrimeNumber {
    public static void main (String args[]){
        int i,j;
        System.out.println("Series of Prime Number up to 25 is: /n");
        for(i=2; i<=25; i++){
            for(j=2; j<=i; j++){
                if(i%j == 0)
                break;
            }
            if(i==j) {
                System.out.println(" "+i+" ");
            }
        }
    }
}
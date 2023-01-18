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


// 1+2+3+............+N series
public class N_series {
    public static void main(String args[]){
        int i, n, sum=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


// Write a program to find the largest number out of three numbers
public class BigNumber {
    public static void main (String args[]) {
        int x=11, y=7, z=9;
        if(x>y && x>z){
            System.out.println("largest number is:" + x);
        }
        else if(y>z && y>x){
            System.out.println("largest number is:" + y);
        }
        else {
           System.out.println("largest number is:" + z); 
        }
    }
}

// Write a Java program using method overloading
public class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  
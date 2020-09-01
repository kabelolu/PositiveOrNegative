import java.util.Scanner;

class PositiveOrNegative{
PositiveOrNegative(){}

public static void main(String [] args){

Scanner scan = new Scanner(System.in);
int No;
System.out.print("Please enter No: " );
No = scan.nextInt();
if (No>0){
System.out.println("Number is positive");
}
if (No<0){
System.out.println("Number is negative");
}
}
}

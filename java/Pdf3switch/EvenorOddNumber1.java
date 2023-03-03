package Pdf3switch;
import  java .util.Scanner;


public class EvenorOddNumber1 {
    public static void main(String[] args) {

        int number,reminder;
        System.out.println("pls Enter an Integer number");
        Scanner scan  = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        reminder = number % 2;
        if (reminder ==0)
            System.out.println(number + "is in Even number");
        else
            System.out.println(number + "is an odd number");




    }
}

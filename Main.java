import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int number = sc.nextInt();

        // checking for armstrong number using isArmstrong() method of ArmstrongNumber class
        boolean isArmstrong = ArmstrongNumber.isArmstrong(number);

        // printing result
        System.out.println(isArmstrong);
        
        // closing resource
        sc.close();
    }
}
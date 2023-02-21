public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int temp = num, number = 0;

        // calculating number of digits in a given number
        int digits = (int)Math.floor(Math.log10(num) + 1);

        // logic to check whether the number is armstrong or not
        while(num != 0) {
            number = number + (int)Math.pow(num%10, digits);
            num /= 10;
        }

        if(temp == number) {
            return true;
        } else {
            return false;
        }
    }
}
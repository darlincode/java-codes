import java.util.Scanner;
public class palingdrome {
    public static void main(String[] args) {
        int temp = 0;
        int modulus;
        int tempNum;
        int num;
        boolean condition = true;

        System.out.println("Enter Number to return Palindrome:");
        Scanner userInput = new Scanner(System.in);
        num = userInput.nextInt();
        while (condition) {
            if (num >= 10000 && num <= 99999) {
                tempNum = num;

                while (tempNum > 0) {
                    modulus = tempNum % 10;
                    temp = temp * 10 + modulus;
                    tempNum = tempNum / 10;

                    condition = false;

                }

            } else {
                System.out.println("Enter a five digit number");
                num = userInput.nextInt();
            }
        }
        if (num == temp) {
            System.out.println("Number is Palindrome.");
        } else {

            System.out.println("Number is NOT Palindrome.");

        }
    }
}

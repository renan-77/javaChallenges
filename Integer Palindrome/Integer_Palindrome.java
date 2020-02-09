class Integer_Palindrome{
    public static void main(String[] args) {
        System.out.println(integerPalindrome(1001));
    }

    //Checks if the number is a palindrome.
    static boolean integerPalindrome(int number){
        boolean isPalindrome = false;

        int palindrome = number;
        int reverse = 0;

        //Checks the inversed version of the number, using modulus to get the last number and dividing palindrome by 10 to keep the loop going.
        while(palindrome != 0){
            int remainder = palindrome % 10;
            
            reverse = reverse * 10 + remainder;

            palindrome = palindrome / 10;
        }

        System.out.println("Number is: " + number + " and the reverse is: " + reverse);

        if(number == reverse){
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
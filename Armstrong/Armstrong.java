class Armstrong{
    public static void main(String[] args) {
        System.out.println(armstrongCheck(374));
    }

    static boolean armstrongCheck(int number){
        boolean isArmstrong =  false;
        int inputNumber = number;
        int remainder;
        int sumOfPowers = 0;

        //While loop using modulus and division to go through the decimal places.
        while(number != 0){
            remainder = number % 10;
            number = number / 10;

            //Summing the power of the current decimal place to an assigned variable.
            sumOfPowers = sumOfPowers + (int)(Math.pow(remainder, 3));
        }

        System.out.println("Sum of the powers: " + sumOfPowers + " and input number: " + inputNumber);

        if(sumOfPowers == inputNumber){
            isArmstrong = true;
        }

        return isArmstrong;

    }
}
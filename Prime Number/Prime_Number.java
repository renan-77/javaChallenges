class Prime_Number{
    public static void main(String[] args){

        System.out.println(primeNumber(13));

    }

    //States if the number is prime.
    static boolean primeNumber(int number){
        boolean isPrime = false;
        int possibleDivisions = 0;
        //Checks if the number is divisible by i, if it is, increases the number of possible divisions.
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                possibleDivisions++;
            }
        }
        //To be prime possible divisions have to be 2.
        if(possibleDivisions == 2){
            isPrime = true;
        }
        return isPrime;
    }
}
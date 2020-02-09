class Factorial{
    public static void main(String[] args){
        System.out.println(factorialResult(5)); 
    }

    //Recursive function for factorial
    static int factorialResult(int number){
        if(number == 1){
            return 1;
        }
        return number * factorialResult(number - 1); 
    }
}
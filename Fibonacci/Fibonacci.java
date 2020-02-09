class Fibonacci{
    public static void main(String[] args) {

        System.out.println(fibonacciIteration(12));
        
    }

    //Recursive function for fibonacci numbers.
    static int fibonacciNumbers(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciNumbers(number - 1) + fibonacciNumbers(number - 2);
    }

    //Non recursive function for fibonacci numbers.
    static int fibonacciIteration(int number){
        int fibo1, fibo2, fibonacci;
        
        fibo1 = 1; fibo2 = 1; fibonacci = 1;

        if(number == 1 || number == 2){
            return 1;
        }

        for(int i = 3; i <= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

            System.out.print(fibonacci + ", ");
        }

        return fibonacci;
    }

    
}
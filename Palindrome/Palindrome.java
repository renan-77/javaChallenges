class Palindrome{
    public static void main(String[] args) {
        System.out.println(palindromeCheck("arara"));
    }

    static boolean palindromeCheck(String word){
        boolean isPalindrome = false;
        
        int counter = 0;
        char[] inversed = new char[word.length()];

        for(int i = (word.length() - 1) ; i >=0 ; i--){
            inversed[counter] = word.charAt(i);
            counter++;
        }

        String inversedWord = new String(inversed);
        System.out.println(word + " and " + inversedWord);

        if(word.equalsIgnoreCase(inversedWord)){
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
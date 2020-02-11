class Reverse_String{
    public static void main(String[] args) {
        System.out.println(reverseString("renan"));
    }

    static String reverseString(String word){
        char[] reversedArr = new char[word.length()]; 
        int counter =  0;
        for(int i = word.length() - 1; i >= 0; i--){
            reversedArr[counter] = word.charAt(i);
            counter++;
        }

        String reversedString = new String(reversedArr);
        return reversedString;
    }
}
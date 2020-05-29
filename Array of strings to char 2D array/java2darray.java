//Importing Arrays library to print the 2d array in the end.
import java.util.Arrays;

class java2darray{
    public static void main(String[] args) {
        //Creating array for argument.
        String names[] = {"Renan", "Alison", "Vanderson", "Fergal"};
        //Calling the function using array above as argument.
        nameToArray(names);
    }

    //Method to create and populate 2d array with array of strings.
    static Character[][] nameToArray(String names[]){
        //Creating int to check the longest name length in array.
        int longestNameLength = 0;
        
        //Loop to check the longest name length.
        for(int i = 0; i < names.length; i++){
            //If current name in index i is longer than the current longestNameLength variable, make longestNameLength = name in index i.
            if(names[i].length() > longestNameLength){
                longestNameLength = names[i].length();
                //Outputing the longest name found (it's gonna print nearly all of them so, only consider the last output).
                System.out.println("Current longest name is: " + names[i] + " - " + longestNameLength);
            }
        }

        //Checking the size of longest name.
        System.out.println("Longest name length: " + longestNameLength);

        //Creating the 2D array based on names.length to be the number of rows and longestNameLength to be number of columns.
        Character names2D[][] = new Character[names.length][longestNameLength];

        //Loop to declare new array elements
        for(int i = 0; i < names.length; i++){
            //Creating a temporary char array for the current index, turning the current string onto a char array (.toCharArray()).
            char temp[] = names[i].toCharArray();
            //Nested loop to populate the current row's columns with the temp[] array elements.
            for(int j = 0; j < names[i].length(); j++){
                //Populating array [i] (i will only change once j goes from 0 to max!) and in j where is the length of current temp array.
                names2D[i][j] = temp[j];
                //Printing out the current letter being used
                System.out.println(temp[j]);
            }
            //Separating names in characters before loop 1 starts again.
            System.out.println("############################################################################################################");
        }
        //Printing out 2d array using Arrays.deepToString() method.
        System.out.println(Arrays.deepToString(names2D));
        //Returning names2D array.
        return names2D;
    }
}
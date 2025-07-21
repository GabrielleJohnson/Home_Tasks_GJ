import java.util.*;

public class isReverse_Implementation_1 {
    public static void main(String[] args) {

        String stringToRevers = "I'm going to go to school today morning.";
        String strNew = "";

        //reverses the string
        for (int i = stringToRevers.length()-1; i>=0 ; i--){
            strNew += stringToRevers.charAt(i); //checks the index
        }

        //prints the results
        System.out.println(strNew);
    }
}

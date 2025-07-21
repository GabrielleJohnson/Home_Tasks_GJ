import java.util.*;

public class isReverse_Implementation_2 {
    public static void main(String[] args) {

        String stringToRevers = "I'm going to go to school today morning.";

        StringBuffer stringBuff = new StringBuffer();

        stringBuff.append(stringToRevers);
        stringBuff.reverse();

        System.out.println(stringBuff);
    }
}

/*
 * Gabrielle Johnson
 * Quality Assurance Engineer Intern
 * July 21, 2025
 * Reverses string using String Builder
 * */

import java.util.*;

public class isReverse_Implementation_3 {
    public static void main(String[] args) {

        String stringToRevers = "I'm going to go to school today morning.";
        StringBuilder stringBuild = new StringBuilder(stringToRevers);

        stringBuild.reverse();

        System.out.println(stringBuild.toString());

    }
}

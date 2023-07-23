package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for ( int i =0;i<=array.length-1;i++){
            if (array [i] == value);


        }return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] rev = new String[array.length];
        int count=0;
        for (int i= array.length-1;i>=0;i--){
            rev[count]  = array[i];
            count++;
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array,reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array){
        String arrToStr = Arrays.toString(array).toLowerCase();
        boolean isPangramic = true;

        for (char i ='a'; i <= 'z'; i ++){
            if (!arrToStr.contains(String.valueOf(i))) {
                isPangramic = false;
            }
        }
        return isPangramic;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value){
        int counter = 0;
        for(int i = 0; i < array.length;i++){
            if( array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }


    /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int newArraySize = (array.length - getNumberOfOccurrences(array, valueToRemove));
        String[] newArray = new String[newArraySize];
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if (!array[i].equals(valueToRemove)){
                newArray[counter] = array[i];
                counter++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removedDuplicatesArray = new ArrayList<>();
        int Count = array.length - 2;

        for (int i = 0; i < array.length - 1; i++) {
            String current = array[i];
            String next = array[i + 1];

            if (!current.equals(next)){

                removedDuplicatesArray.add(current);
            }
            if (i == Count){
                removedDuplicatesArray.add(next);
            }

        }
        return removedDuplicatesArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<>(Arrays.asList(array));

        for(int i = 0; i < newArray.size() - 1; i++){

            String chara = newArray.get(i);
            String nextchara = newArray.get(i + 1);

            if (chara.charAt(0) == (nextchara.charAt(0))){
                newArray.set(i, chara + nextchara);
                newArray.remove(nextchara);
                i--;
            }
        }
        return newArray.toArray(new String[0]);
    }
}
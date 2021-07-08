package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Testtingg";
        // here i am converting to uppercase
        str = str.replaceAll("\\s","").toUpperCase();
        // calculating the length of string
        int len = str.length();
        System.out.println("Char \t Occurrences" );
        while(len > 0) {
            int counter = 1;
            for(int i=1; i < len; i++){
                if(str.charAt(0) == str.charAt(i)){
                    counter++;
                }
            }
            // here i am checking condition from greater thant 0 because for printing full string
            if (counter > 0) {
                System.out.println(str.charAt(0)+"\t\t "+counter);
            }
            // trim will ignore the blank space
            // individual character will store inside ch
            String ch = String.valueOf(str.charAt(0)).trim();
            str = str.replaceAll(ch,"");
            len -= counter;
        }
    }
}

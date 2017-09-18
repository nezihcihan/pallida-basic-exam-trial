// Create a function that takes an email address as input in the following format:
// firstName.lastName@exam.com
//and returns a string that represents the user name in the following format: lastName firstName
//example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
//accents does not matter
//System.out.println(nameFromEmail("elek.viz@exam.com"));

import java.util.ArrayList;
import java.util.Scanner;

public class NameFromEmail {

    public static void main(String[] args) {
        nameFromEmail(userInputEmail());
    }

    /** Method for First and Last Name Grab **/
    public static void nameFromEmail (String list){
        //String list = "elek.viz@exam.com";
        char[] newList = list.toCharArray();
        String fullName = "";
        for (int i = 0; i < newList.length; i++) {
            if (newList[i] == '@') {
                fullName = list.substring(0, i);
            }
        }
        String firstName = "";
        String lastName = "";
        char[] full = fullName.toCharArray();
        for (int j = 0; j < full.length; j++) {
            if (full[j] == '.') {
                firstName = fullName.substring(0, j);
                lastName = fullName.substring(j + 1);
            }
        }
        System.out.print((firstName.toUpperCase() + firstName.substring(1)) + " " + lastName.toUpperCase());
    }

    /** Method for user input **/
    public static String userInputEmail(){
        System.out.println("Enter your email");
        Scanner input = new Scanner(System.in);
        String list = input.nextLine();
        return list;
    }
}

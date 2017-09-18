// Create a function that takes a list as a parameter,
// and returns a new list with every odd element from the orignal list
//System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
// should print [1, 3, 5]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OddFilter {
    public static void main(String[] args) {
        oddFilter(userInputNumberList());
    }

    /** Method For Odd Filter **/
    public static void oddFilter (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    /** Method for user input **/
    public static ArrayList<Integer> userInputNumberList(){
        System.out.println("Enter list of numbers after you complete your list PRESS X.");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        while(input.hasNextInt()){
            numList.add(input.nextInt());
        }
        return numList;
    }
}

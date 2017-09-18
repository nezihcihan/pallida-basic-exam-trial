// Create a function that takes a list of GitHub handles as
// input and returns a list of strings that represents
// GitHub url's under Green Fox Academy organization in the following format:
// "https://github.com/greenfox-academy/teststudent"
// example:
// input: ["ghhandle1", "ghhandle2"]
// output: ["https://github.com/greenfox-academy/ghhandle1",
// "https://github.com/greenfox-academy/ghhandle2"]
//System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));
import java.util.ArrayList;
import java.util.Arrays;

public class UrlsFromHandles {

	public static void main(String[] args){
	    String greenfox = "https://github.com/greenfox-academy/";
        ArrayList<String> handles = new ArrayList<String>();
        handles.addAll(Arrays.asList("ghhandle1", "ghhandle2"));
        for (int i = 0; i < handles.size() ; i++) {
            System.out.println("Your link is: " + greenfox + handles.get(i));
        }
    }
}

package Solutions;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day1 {

    public static void main(String[] args) throws IOException {

        ForProblems reader = new ForProblems("src/Problems", "day1Q.txt", "day1Q.txt");

        List<String> problem = reader.getFileLines();

        String splitProblem = Arrays.toString(problem.get(0).split(""));

        System.out.println(splitProblem);

        int counter = 0;
        for(int i = 0; i < splitProblem.length(); i++){
            if(splitProblem.charAt(i) == '('){
                counter++;
            } else if(splitProblem.charAt(i) == ')'){
                counter--;
            }
        }

        System.out.println(counter);


    }

}

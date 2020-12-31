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
        ArrayList<Character> filtered = new ArrayList<>();

        for(int i = 0; i < splitProblem.length(); i++){
            if(splitProblem.charAt(i) == '('){
                filtered.add(splitProblem.charAt(i));
            } else if(splitProblem.charAt(i) == ')'){
                filtered.add(splitProblem.charAt(i));
            }
        }


        int counter = 0;
        int spot = 0;
        for(int i = 0; i < filtered.size(); i++){
            if(filtered.get(i) == '('){
                counter++;
            } else if(filtered.get(i) == ')'){
                counter--;
            }
            if(counter == -1){
                spot = i + 1;
                break;//for part 2
            }
        }

        System.out.println(counter);
        System.out.println(spot);


    }

}

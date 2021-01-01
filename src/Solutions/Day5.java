package Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Day5 {

    public static void main(String[] args) throws IOException {
        ForProblems reader = new ForProblems("src/Problems", "day5Q.txt", "day5Q.txt");
//        reader.writeToLog("Create file");

        List<String> input = reader.getFileLines();

        System.out.println(input);

        int counter = 0;
        for(String line : input){
            if(hasVowels(line)){
                if(nice(line)){
                    if(duplicate(line)){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);


    }

    public static boolean hasVowels(String input){
        int count = 0;
        String v1 = "a";
        String v2 = "e";
        String v3 = "i";
        String v4 = "o";
        String v5 = "u";

        String[] inputArr = input.split("");

        for(String letter : inputArr){
            if(letter.equalsIgnoreCase(v1)){
                count++;
            } else if(letter.equalsIgnoreCase(v2)){
                count++;
            } else if(letter.equalsIgnoreCase(v3)){
                count++;
            } else if(letter.equalsIgnoreCase(v4)){
                count++;
            } else if(letter.equalsIgnoreCase(v5)){
                count++;
            }
        }

        return count >= 3;
    }

    public static boolean duplicate(String input){
        String[] inputArr = input.split("");
        int counter = 0;

        int len = inputArr.length;

        for(int i = 1; i < len; i++){
            if(inputArr[i].equalsIgnoreCase(inputArr[i - 1])){
                counter++;
            }
        }

        return counter > 0;
    }

    public static boolean nice(String input){
        int counter = 0;
        String bad1 = "ab";
        String bad2 = "cd";
        String bad3 = "pq";
        String bad4 = "xy";

        if(!input.contains(bad1)){
            if(!input.contains(bad2)){
                if(!input.contains(bad3)){
                    if(!input.contains(bad4)){
                        counter++;
                    }
                }
            }
        }

        return counter > 0;
    }


}

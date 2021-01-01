package Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Day2 {

    public static void main(String[] args) throws IOException {

        ForProblems reader = new ForProblems("src/Problems", "day2Q.txt", "day2Q.txt");
//        reader.writeToLog("Create");

        List<String> problem = reader.getFileLines();

//        System.out.println(problem);

        int total = 0;
        for(String dimension : problem){
            String[] set = converter(dimension);
            total += getSqFt(set);
            total += getSmallestSide(set);
        }

        System.out.println(total);


    }

    public static String[] converter(String dimensions){
        String[] sizes = new String[1];
        sizes[0] = dimensions;
        return sizes[0].split("x");
    }

    public static int getSqFt(String[] sizes){
        int l = Integer.parseInt(sizes[0]);
        int w = Integer.parseInt(sizes[1]);
        int h = Integer.parseInt(sizes[2]);

//        int a1 = 2 * (l * w);
//        int a2 = 2 * (l * h);
//        int a3 = 2 * (h * w);
//
//        return (a1 + a2 + a3);
        //PART ONE

        //PART TWO
        return l * w * h;

    }

    public static int getSmallestSide(String[] sizes){
        int l = Integer.parseInt(sizes[0]);
        int w = Integer.parseInt(sizes[1]);
        int h = Integer.parseInt(sizes[2]);

//        int a1 = l * w;
//        int a2 = w * h;
//        int a3 = l * h;//PART ONE

        //PART TWO
        int a1 = 2 * l + 2 * w;
        int a2 = 2 * w + 2 * h;
        int a3 = 2 * l + 2 * h;

        int currSmallest =  Math.min(a1, a2);
        return Math.min(a3, currSmallest);
    }
}

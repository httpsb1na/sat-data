import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println(totalScore.size() + " students took the exam.");
    
    // find highest score
    int highestScore = totalScore.get(0);
    for(int i = 1; i < totalScore.size(); i++){
      if(totalScore.get(i) > highestScore)
        highestScore = totalScore.get(i);
    }
    System.out.println("The highest score is: " + highestScore);

    // find lowest score
    int lowestScore = totalScore.get(0);
    for(int i = 1; i < totalScore.size(); i++){
      if(totalScore.get(i) < lowestScore)
        lowestScore = totalScore.get(i);
    }
    System.out.println("The lowest score is: " + lowestScore);

    // calculate the average score
    int sum = 0;
    for (int i = 0; i < totalScore.size(); i++) {
      sum += totalScore.get(i);
    }
    double averageScore = (double) sum / totalScore.size();
    System.out.println("The average score is: " + averageScore);
    
  }

}

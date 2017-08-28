import java.util.*;
import java.lang.*;

public class FantasyFootballDraftOrderRand {
    public static void main(String[] args) {
      //ArrayList that will hold the picks remaining 
      ArrayList<String> spots = new ArrayList<String>();
      ArrayList<String> names= new ArrayList<String>();
      
      // populate the list of names
      names = addNames(names);
      
      
      
      //populate ArrayList of picks
       for(Integer i = 1; i < 13; i++){
         spots.add(i.toString());
       }
      
      //print out the unrandomized list
      System.out.println("Unrandomized Draft Order");
      printNamesandPicks(names,spots);
      
      //randomize the list
      Collections.shuffle(spots);

      //print out randomize picks
      System.out.println("Randomized Draft Order");
      printNamesandPicks(names,spots);


      //manual implementation of shuffling a list of ints below
      
      // while(spots.size() > 0){
      //   int temp = (int) (Math.random() * spots.size());
      //   int pick = spots.get(temp);
        
      //   spots.remove(temp);
        
      //   System.out.println(pick);
      //   System.out.println(spots);
      // }
      
      
      }
      public static void printNamesandPicks(ArrayList<String> names, ArrayList<String> picks){
        
        System.out.println("********************");
        
        for(int i = 0; i < names.size(); i++){
          //print pipe and name
          System.out.print("|    " + names.get(i));
          
          //fix white space issue after names 
          int maxNameCharacters = 0;
          for(String name : names){
            if (name.length() > maxNameCharacters){
              maxNameCharacters = name.length();
            }
          }
          
          while(names.get(i).length() < maxNameCharacters){
          System.out.print(" ");
          maxNameCharacters--;
          }
          
          //print : and pick number
          System.out.print(" : " + picks.get(i));
          
          //fix white space issue after pick number
          if(picks.get(i).length() > 1){
            System.out.println("   |");
          }else{
            System.out.println("    |");
          }
        }
        
        
        System.out.println("******************** \n");

      }
      
      public static ArrayList<String> addNames(ArrayList<String> names){
       // adding members names to list
        names.add("Graham");
        names.add("Chris");
        names.add("Brian");
        names.add("Jordan");
        names.add("Ray");
        names.add("David");
        names.add("Ash");
        names.add("Aliko");
        names.add("Peter");
        names.add("Vince");
        names.add("Andrew");
        names.add("Arjun");
        
        return names;
      
    }
}
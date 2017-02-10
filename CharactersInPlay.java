
/**
 * Write a description of CharactersInPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
import java.io.*;

public class CharactersInPlay {
  private ArrayList<String> actorNames;
  private ArrayList<Integer> nameCounts;
  
  public CharactersInPlay(){
      actorNames = new ArrayList<String>();
      nameCounts = new ArrayList<Integer>();
    }
    
  public void update(String person){
  //update two arrayLists, adding the actors name if it is not there and counting
      int index = actorNames.indexOf(person);
      if (index== -1){// found new actor
          actorNames.add(person);
          nameCounts.add(1);
        }
      else {
          int freq = nameCounts.get(index);
          nameCounts.set(index,freq+1);
        }
      
  }
  
  public void findAllCharacters(){
  // opens file, reads file line by line. calls update to count.    
     actorNames.clear();
     nameCounts.clear();

    FileResource resource = new FileResource();
	for(String line : resource.lines()){
		//System.out.println(line);
		if (line.contains(".")) {
		    int periodIndex = line.indexOf(".");
		    String actor = line.substring(0, periodIndex);
		    update(actor);
		    //System.out.println(actor);
		  }
		
	}

}
  
public void charactersWithNumParts(int num1, int num2){
       for (int k=0; k<nameCounts.size(); k++){
	    if ( (nameCounts.get(k)>=num1) && (nameCounts.get(k)<=num2)){
        System.out.println(actorNames.get(k) + "  " + nameCounts.get(k));
        }
    } 
    
}



  public void tester(){
  //call findAllCharacters. print out main character followed by # of speaking parts.    
    findAllCharacters();
    
    for (int k=0; k<nameCounts.size(); k++){
	    if (nameCounts.get(k)>10){
        System.out.println(actorNames.get(k) + "  " + nameCounts.get(k));
        }
    }
    int num1 = 10;
    int num2 = 15;
    System.out.println("Printing actors line counts between " + num1+ "  " + num2);
    charactersWithNumParts(num1, num2);
  }
  
    
    
}

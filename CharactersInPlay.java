
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
      
      
  }
  
  public void findAllCharacters(){
  // opens file, reads file line by line. calls update to count.    
     actorNames.clear();
     nameCounts.clear();

    FileResource resource = new FileResource();
	for(String line : resource.lines()){
		System.out.println(line);
		if (line.contains(".")) {
		    int periodIndex = line.indexOf(".");
		    String actor = line.substring(0, periodIndex);
		    System.out.println(actor);
		  }
		
	}
  }
  

  
  
  public void tester(){
  //call findAllCharacters. print out main character followed by # of speaking parts.    
      
  }
  
    
    
}

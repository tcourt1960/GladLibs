
/**
 * Write a description of WordFrequencies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;

public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public WordFrequencies(){
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }
    
    
    public void findUnique(){
        myWords.clear();
        myFreqs.clear();
        
        FileResource file = new FileResource();
    
        for (String s : file.words()){
            s=s.toLowerCase();
            int index = myWords.indexOf(s);
            if (index == -1){
                myWords.add(s);
                myFreqs.add(1);
            }
            else {
                int freq = myFreqs.get(index);
                myFreqs.set(index, freq+1);
            }
        }
    }
    
    public int findMax(){
        int max = myFreqs.get(0);
        int maxIndex = 0;
        for(int k=0; k < myFreqs.size(); k++){
            if (myFreqs.get(k) > max){
                max = myFreqs.get(k);
                maxIndex = k;
            }
        }
        return maxIndex;
    }
    
    
    
    public void tester(){
        findUnique();
        System.out.println("There are " + myWords.size() + " unique words");
        for (int k=0; k<myWords.size(); k++){
            System.out.println(myWords.get(k) + '\t' + myFreqs.get(k));
        }
        int index = findMax();
        System.out.println("Max Word Freq is: "+myWords.get(index) + "  " + myFreqs.get(index));
        
        
    }
}

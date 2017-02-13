
/**
 * Write a description of CodonCount here.
 * Duke Java Programming Coursera course
 * @author Tom Courtney
 * @version Feb 13, 2017
 */

import edu.duke.*;
import java.io.*;
import java.util.*;

public class CodonCount {

    private HashMap<String,Integer> codonMap;

    
    public CodonCount(){
        codonMap = new HashMap<String, Integer>();
    }
    
public void buildCodonMap(int start, String dna){
//builds a new map of codons mapped to their counts from string dna with reading frame with start position 0, 1, 2
String dna_framed = dna.substring(start);
dna_framed = dna_framed.toUpperCase();

ArrayList<String> codonList = new ArrayList<String>();
		
		//clear the map
		codonMap.clear();
		
		//create dna substring considering the start position

		
		//call the helper method that returns an arraylist of codons
		codonList = findCodonList(dna_framed, 3);
		
		//Add codons to the map
		for (int i=0; i<codonList.size();i++){
			if (!codonMap.containsKey(codonList.get(i))){
				codonMap.put(codonList.get(i), 1);
			} else {
				codonMap.put(codonList.get(i), codonMap.get(codonList.get(i))+1);
			}
		}

}
    

private ArrayList<String> findCodonList(String s, int len){
	ArrayList<String> stringlets = new ArrayList<String>();
	int start_pos = 0;
	while ((start_pos+len)<=s.length()){
		String sub = s.substring(start_pos, start_pos+len);
		stringlets.add(sub);
		start_pos = start_pos+len;
	}
	return stringlets;
}

public String getMostCommonCodon(){
    return "";
}

public void tester(){
FileResource file = new FileResource();
String dna = file.asString();

System.out.println(dna);

}

}

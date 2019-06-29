package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

//funkcija za pomocne funkcije
public class Util {

	 /**
	   * Vraca u procentima (broj izmedju 0 i 1) "slicnost" dva stringa.
	   * Levenshtein-ov algoritam
	   */
	  public static double similarity(String s1, String s2) {
	    String longer = s1, shorter = s2;
	    if (s1.length() < s2.length()) { // koji je duzi
	      longer = s2; shorter = s1;
	    }
	    int longerLength = longer.length();
	    if (longerLength == 0) { return 1.0; /* ako su oba prazna */ }
	    return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

	  }

	  // Izvor: http://rosettacode.org/wiki/Levenshtein_distance#Java
	  public static int editDistance(String s1, String s2) {
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    int[] costs = new int[s2.length() + 1];
	    for (int i = 0; i <= s1.length(); i++) {
	      int lastValue = i;
	      for (int j = 0; j <= s2.length(); j++) {
	        if (i == 0)
	          costs[j] = j;
	        else {
	          if (j > 0) {
	            int newValue = costs[j - 1];
	            if (s1.charAt(i - 1) != s2.charAt(j - 1))
	              newValue = Math.min(Math.min(newValue, lastValue),
	                  costs[j]) + 1;
	            costs[j - 1] = lastValue;
	            lastValue = newValue;
	          }
	        }
	      }
	      if (i > 0)
	        costs[s2.length()] = lastValue;
	    }
	    return costs[s2.length()];
	  }

	/*
	 * Pretvori liste u setove da bi equals metoda vracala true i u slucaju da su tagovi isti ali ne idu istim redosledom u obe liste.
	 */
	  public static boolean proveriTagove(Collection<Tag> tag1, Collection<Tag> tag2) {
		  return new HashSet<>(tag1).equals(new HashSet<>(tag2));
		}
	  
}

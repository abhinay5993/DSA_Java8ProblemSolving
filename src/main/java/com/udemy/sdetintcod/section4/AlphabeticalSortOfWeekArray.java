package com.udemy.sdetintcod.section4;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Part of TCS interview - 07-02-2026
 * 
 */
public class AlphabeticalSortOfWeekArray {

	public static void main(String[] args) {
	String[] strWeekArray={"sun","mon","tue","wed","thu","fri","sat"};
	System.out.println("\nInput string array : "+Arrays.toString(strWeekArray));
	System.out.println("\nResultant Sorted Array : "+Arrays.toString(alphaSortedArrayItems(strWeekArray)));
	}

	/**
	 * Using TreeSet inbuilt sorted property
	 * 
	 * @param strWeekArray
	 * @return
	 */
	private static String[] alphaSortedArrayItems(String[] strWeekArray) {
		Set<String> sortedSet = new TreeSet<>();
		for (String strItems : strWeekArray) {
			sortedSet.add(strItems);
		}
		return sortedSet.toArray(new String[0]);
	}

}
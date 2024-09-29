/*
 * *** SYDNEY AMAYA / SECTION 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  /**
   * Psuedo code: 
   * 1.create two temp treesets 
   * 2.use addAll to add all elements from parameters to temp sets
   * 3.use removeAll to create a set with only elements unique to set a
   * 4.use removalAll to create a set with only elements unique to set b 
   * 
   */
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    TreeSet<Integer> tempA = new TreeSet<>();
    TreeSet<Integer> tempB = new TreeSet<>();
    TreeSet<Integer> different = new TreeSet<>();
    setA.removeAll(tempB);
    setB.removeAll(tempA);
    different.addAll(setA);
    different.addAll(setB);
    return different;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  /**
   * Pseudo code: 
   * 1.Traverse teeMap 
   * 2.use an if statement to see if key value is even using if % 2 = 0
   * 3.if true then remove key pair
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    int key = 0;
    for (Map.Entry<Integer, String> mapElement : treeMap.entrySet()){
      key = (int) mapElement.getKey();
      if (key % 2 == 0){
        treeMap.remove(mapElement.getKey());
      }
    }
  }
  

  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  /**
   * Pseudo code: 
   * 
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    boolean isEqual = false;


    return isEqual;

  }

} // end treeProblems class

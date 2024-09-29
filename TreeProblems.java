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
   * 1.
   */
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    TreeSet<Integer> temp1 = new TreeSet<>();
    TreeSet<Integer> temp2 = new TreeSet<>();
    temp1.addAll(setA);
    temp1.addAll(setB);
    temp2.addAll(setA);
    temp2.retainAll(setB);
    temp1.removeAll(temp2);
    return temp1;
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
   //create iterator
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
   //use while loop to traverse treeMap
    while (iterator.hasNext()){
      Map.Entry<Integer, String> entry = iterator.next();
      //if % 2 = 0 them key is even and must be removed
      if(entry.getKey() % 2 == 0){
        iterator.remove();
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
   * use .equals method
   */
  
  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2);
  }

} // end treeProblems class

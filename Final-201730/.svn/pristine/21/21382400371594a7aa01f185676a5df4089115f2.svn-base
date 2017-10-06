package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapProblem {
	/**
	 * Given a map representing relation from child (key) to parent (value), find siblings of the given child.
	 * Return an empty list if the sibling is not found or the supplied child is missing in the childToParent map.
	 * 
	 * For example:
	 * getConnected({C1 -> P1, C2 -> P1, C3 -> P1, C4 -> P2, C5-> P3}, C1) = [C2, C3],
	 * getConnected({C1 -> P1, C2 -> P1, C3 -> P1, C4 -> P2, C5-> P3}, C4) = [] - an empty array list, and
	 * getConnected({C1 -> P1, C2 -> P1, C3 -> P1, C4 -> P2, C5-> P3}, C6) = []
	 * 
	 * @param childToParentMap The child to parent relation map.
	 * @param child The given child
	 * @return An ArrayList of siblings of the given child.
	 */
	public static ArrayList<String> getSiblings(HashMap<String, String> childToParentMap, String child) {
		ArrayList<String> output = new ArrayList<>();
		for(String current:childToParentMap.keySet()){
			if(current.equals(child)){
				String toCheck = childToParentMap.get(current);
				for(String current2:childToParentMap.keySet()){
					if(!current2.equals(child) && childToParentMap.get(current2) == toCheck){
						output.add(current2);
						System.out.println(current2);
					}
				}
			}
			
		}
		return output;
	}
}

package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map.Entry;


public class MapUtilities {
	/**
	 * The class commonKeyValuePairs check to see whether there are macthing key/pairs in the hashmap
	 * The class takes in user input as the parameter.
	 * First check to see if either or both maps are null. If so thros the exception
	 * Then check to see if either or both of the strings are empty. If so program returns 0.
	 * Entry stores both the key and the element. Created Entry object element
	 * create string key. is = to element.getKey. getKey stores the key elements
	 * create string value. is = to element.getvalue. getvalue stores the value elements
	 * if map2 contains the key from map1 check if the values are the same
	 * if the values are the same add 1 to the num counter/loop until end of hashmaps
	 * @param map1 first hashmap
	 * @param map2 second hashmap
	 * @return 0 or #of pairs
	 * @throws NullMapException
	 */

	public static int commonKeyValuePairs(HashMap<String, String> map1,HashMap<String, String> map2)throws NullMapException {
		int num = 0;
		//int i = 0;
		if (map1 == null || map2 == null) {
            throw new NullMapException("One or both maps are null!");
        }
		if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        for (Entry<String, String> element : map1.entrySet()) {
            String key = element.getKey();
            String value = element.getValue();
            
            if(map2.containsKey(key)) {
            	String value2 = map2.get(key);
            	if(value.equals(value2)) {
            		num++;
            		}
            	}
            
            }
        System.out.println(num);
        return num;
        }
	}



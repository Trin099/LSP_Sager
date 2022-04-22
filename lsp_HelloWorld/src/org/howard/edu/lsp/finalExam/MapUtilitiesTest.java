package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
class MapUtilitiesTest {

	@Test
	public void commonKeyValuePairs() throws NullMapException {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Mary","Ecstatic");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","sick");
		
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set = new MapUtilities();
		assertEquals(2,set.commonKeyValuePairs(map1,map2));
		
		/*map1.clear();
		map2.clear();
		
		map1 = null;
		map2 = null;
		
		MapUtilities set0 = new MapUtilities();
		NullMapException exception = assertThrows(MapUtilities.class, () ->{
			set0.commonKeyValuePairs(map1,map2);});
		
		String ExpectedMessage = "One or both maps are null!";
		String ActualMessage = exception.getMessage();
		
		assertTrue(ActualMessage.contains(ActualMessage));*/
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Chuck","Fine");
		map1.put("Felix","sick");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Phil","Happy");
		
		MapUtilities set1 = new MapUtilities();
		assertEquals(0,set1.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		
		map2.put("Phil","Happy");
		map2.put("Phil","Happy");
		map2.put("Phil","Happy");
		map2.put("Phil","Happy");
		map2.put("Phil","Happy");
		
		MapUtilities set2 = new MapUtilities();
		assertEquals(0,set2.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		map1.put("Mary","Hunrgy");
		
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		
		MapUtilities set3 = new MapUtilities();
		assertEquals(1,set3.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		MapUtilities set4 = new MapUtilities();
		assertEquals(0,set4.commonKeyValuePairs(map1,map2));
		
		map1.put("Mary","Hunrgy");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Mary","Fine");
		map1.put("Felix","sick");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set5 = new MapUtilities();
		assertEquals(1,set5.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Mary","Fine");
		map1.put("Felix","sick");
		
		
		MapUtilities set6 = new MapUtilities();
		assertEquals(0,set6.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		
		
		MapUtilities set7 = new MapUtilities();
		assertEquals(0,set7.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Mary","Fine");
		map1.put("Felix","sick");
		
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		map2.put("Mary","Hunrgy");
		
		
		MapUtilities set8 = new MapUtilities();
		assertEquals(0,set8.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Hunrgy");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set9 = new MapUtilities();
		assertEquals(0,set9.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Ricardo","Superb");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set10 = new MapUtilities();
		assertEquals(1,set10.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Ricardo","Superb");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Trinity","Depressed");
		map2.put("Tam","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set11 = new MapUtilities();
		assertEquals(0,set11.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Ricardo","Superb");
		
		MapUtilities set12 = new MapUtilities();
		assertEquals(0,set12.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","");
		map1.put("Alice","Healthy");
		map1.put("Bob","Happy");
		map1.put("Mary","Fine");
		map1.put("Felix","sick");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Ricardo","Superb");
		map2.put("Tam","Fine");
		map2.put("","Happy");
		
		MapUtilities set13 = new MapUtilities();
		assertEquals(0,set13.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Ecstatic");
		map1.put("Felix","Healthy");
		map1.put("Bob","Happy");
		map1.put("Mary","Fine");
		map1.put("Felix","Healthy");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Felix","Healthy");
		map2.put("Mary","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set14 = new MapUtilities();
		assertEquals(3,set14.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Ecstatic");
		map1.put("Felix","Healthy");
		map1.put("Bob","Happy");
		map1.put("Jane","Fine");
		map1.put("Lola","Healthy");
		
		map2.put("Mary","Ecstatic");
		map2.put("Felix","Healthy");
		map2.put("Bob","Happy");
		map2.put("Jane","Fine");
		map2.put("Bob","Happy");
		
		MapUtilities set15 = new MapUtilities();
		assertEquals(4,set15.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		MapUtilities set16 = new MapUtilities();
		assertEquals(0,set16.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map1.put("Mary","Ecstatic");
		
		MapUtilities set17 = new MapUtilities();
		assertEquals(0,set17.commonKeyValuePairs(map1,map2));
		
		map1.clear();
		map2.clear();
		
		map2.put("Jane","Fine");
		
		MapUtilities set18 = new MapUtilities();
		assertEquals(0,set18.commonKeyValuePairs(map1,map2));
		
		
		
	}
	

}

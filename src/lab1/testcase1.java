/**
 * 
 */
package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author lenovo
 *
 */
public class testcase1 {

	/**
	 * Test method for {@link lab1.HeapTest#queryBridgeWords(lab1.TextGraph, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testQueryBridgeWords() {
		TextGraph tgh=HeapTest.createDirectedGraph("D:/eclipse/workspace/lab1/src/lab1/GraphData.txt");
		 assertEquals("No bridge words from \"explore\" to \"life\"!", HeapTest.queryBridgeWords(tgh, "explore", "life"));
	}

}

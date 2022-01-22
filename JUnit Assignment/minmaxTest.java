import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class minmaxTest {

	int[] expected= {7,21};
	int[] expected1= {5,98};
	int[] expected2= {1,6};
	@Test
	void test() {
		minmax mm=new minmax();
		int[] a= {20,10,4,15,21};
		int[] min=mm.minmaxFinder(a);
		assertArrayEquals(expected,min);  //WithArray
		//assertEquals(4,min[0]);   //With SingleIndex
		/*System.out.println(min);
		int[] max=mm.minmaxFinder(a);
		assertEquals(21,max[1]);
		System.out.println(max[1]);*/
		
	}
	@Test
	void test1() {
		minmax mm=new minmax();
		int[] a= {45,7,48,5,98};
		int[] min=mm.minmaxFinder(a);
		
		assertArrayEquals(expected1,min); 
		//System.out.println(min[0]+" "+ min[1]);
	}
	@Test
	void test2() {
		minmax mm=new minmax();
		int[] a= {2,5,4,1,6};
		int[] min=mm.minmaxFinder(a);
		assertArrayEquals(expected2,min); 
	}

}

package advanceJava;

import org.junit.*;
import static org.junit.Assert.*;

public class JunitTest {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	
	@Before
	public void beforeMethod(){
		System.out.println("Before method");
	}
	
	@Test
	public void testMax(){
		System.out.println("test max");
		assertEquals(8, Calculate.findMax(new int[]{1,2,6,4,8}));
		assertEquals(-1, Calculate.findMax(new int[]{-1,-2,-6,-4,-8}));
	}
	
	@Test
	public void testCube(){
		System.out.println("test cube");
		assertEquals(27, Calculate.cube(3));
	}
	
	@Test
	public void testAdd(){
		System.out.println("test addition");
		assertEquals(5, Calculate.add(2, 3));
	}
	
	@After
	public void after(){
		System.out.println("after method");
	}
	
	@AfterClass
	public static void AfterClass(){
		System.out.println("After Class");
	}
	
}

class Calculate{
	
	public static int findMax(int arr[]){
		int max = arr[0];
		for(int i=0; i<arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int cube(int a){
		int cubeOfNum = a*a*a;
		return cubeOfNum;
	}
	
	public static int add(int a, int b){
		int sum = a+b;
		return sum;
	}
}

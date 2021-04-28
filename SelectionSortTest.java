import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {
//	private SelectionSort list= new SelectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}

    public SelectionSortTest() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 11;
        arr[2] = 4;
        arr[3] = 9;
        arr[4] = 1;

        int[] sorted = new int[5];
        sorted[0] = 1;
        sorted[1] = 4;
        sorted[2] = 5;
        sorted[3] = 9;
        sorted[4] = 11;

        SelectionSort.sort(arr);
        assertEquals(sorted[0], arr[0]);
        assertEquals(sorted[1], arr[1]);
        assertEquals(sorted[2], arr[2]);
        assertEquals(sorted[3], arr[3]);
        assertEquals(sorted[4], arr[4]);

    }

    public void testNegative(){

    	int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -11;
        arr[2] = -4;
        arr[3] = -9;
        arr[4] = -1;

        int[] sorted = new int[5];
        sorted[0] = -11;
        sorted[1] = -9;
        sorted[2] = -5;
        sorted[3] = -4;
        sorted[4] = -1;

        SelectionSort.sort(arr);
        assertEquals(sorted[0], arr[0]);
        assertEquals(sorted[1], arr[1]);
        assertEquals(sorted[2], arr[2]);
        assertEquals(sorted[3], arr[3]);
        assertEquals(sorted[4], arr[4]);
    }

    public void testMixed(){

    	int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = -11;
        arr[2] = 4;
        arr[3] = 0;
        arr[4] = -1;

        int[] sorted = new int[5];
        sorted[0] = -11;
        sorted[1] = -1;
        sorted[2] = 0;
        sorted[3] = 4;
        sorted[4] = 5;

        SelectionSort.sort(arr);
        assertEquals(sorted[0], arr[0]);
        assertEquals(sorted[1], arr[1]);
        assertEquals(sorted[2], arr[2]);
        assertEquals(sorted[3], arr[3]);
        assertEquals(sorted[4], arr[4]);
    }


}

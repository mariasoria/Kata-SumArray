import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumArrayTest {

    @Test
    public void test_01 () {
        assertEquals(12, SumArray.sumArray(new int[]{ 2, 3, 4, 5, 6}));
    }
    @Test
    public void test_02() {
        assertEquals(16, SumArray.sumArray(new int[] { 6, 2, 1, 8, 10}));
    }

    @Test
    public void test_03(){
        assertEquals(0, SumArray.sumArray(new int[] {}));
    }

    @Test
    public void test_04(){
        assertEquals(0, SumArray.sumArray(new int[] {2}));
    }

    @Test
    public void test_05(){
        assertEquals(0, SumArray.sumArray(null));
    }
}

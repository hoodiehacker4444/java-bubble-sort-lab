package bubble;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSorterTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testTiny() {
        int[] a = {1, 24, 5, 10};
        int[] sorted = {1, 5, 10, 24};

        BubbleSorter sorter = new BubbleSorter(a);
        sorter.sort();
        //what line of code should I add here to see if the Array is Sorted?
        assertArrayEquals("arrays are not equal", sorted, a);
    }

    @Test
    public void testBackward() {
        //This should test your algorithm on an array that is in reverse order
        int[] a = {24, 10, 5, 1};
        int[] sorted = {1, 5, 10, 24};

        BubbleSorter sorter = new BubbleSorter(a);
        sorter.sort();
        //what line of code should I add here to see if the Array is Sorted?
        assertArrayEquals("arrays are not equal", sorted, a);
    }

    @Test
    public void testAlreadySorted() {
        int[] a = {1, 5, 10, 24};
        int[] sorted = {1, 5, 10, 24};

        BubbleSorter sorter = new BubbleSorter(a);
        sorter.sort();
        //what line of code should I add here to see if the Array is Sorted?
        assertArrayEquals("arrays are not equal", sorted, a);
    }

}

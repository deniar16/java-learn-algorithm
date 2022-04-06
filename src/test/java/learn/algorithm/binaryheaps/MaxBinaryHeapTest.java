package learn.algorithm.binaryheaps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MaxBinaryHeapTest {

    @Test
    public void insertSortedNum(){
        MaxBinaryHeap heap = new MaxBinaryHeap(3);
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        
        int[] res = new int[]{41, 39, 33};
        assertTrue(Arrays.equals(res, heap.getValues()));
    }

    @Test
    public void insertBiggerNumber(){
        MaxBinaryHeap heap = new MaxBinaryHeap(7);
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        heap.insert(18);
        heap.insert(27);
        heap.insert(12);
        heap.insert(55);
        
        int[] res = new int[]{55, 39, 41, 18, 27, 12, 33};
        assertTrue(Arrays.equals(res, heap.getValues()));
    }

    @Test
    public void insertBiggerNumberAndSmallestNumber(){
        MaxBinaryHeap heap = new MaxBinaryHeap(8);
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        heap.insert(18);
        heap.insert(27);
        heap.insert(12);
        heap.insert(55);
        heap.insert(1);
        
        int[] res = new int[]{55, 39, 41, 18, 27, 12, 33, 1};
        assertTrue(Arrays.equals(res, heap.getValues()));
    }

    @Test
    public void extractMax(){
        MaxBinaryHeap heap = new MaxBinaryHeap(8);
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        heap.insert(18);
        heap.insert(27);
        heap.insert(12);
        heap.insert(55);
        heap.insert(1);
        heap.extractMax();
        heap.print();
        int[] res = new int[]{41, 39, 33, 18, 27, 12, 1, 0};
        assertTrue(Arrays.equals(res, heap.getValues()));
        heap.extractMax();        
        int[] res2 = new int[]{39, 27, 33, 18, 1, 12, 0, 0};
        assertTrue(Arrays.equals(res2, heap.getValues()));
    }
    
}

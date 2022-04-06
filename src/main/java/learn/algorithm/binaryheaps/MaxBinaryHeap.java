package learn.algorithm.binaryheaps;

public class MaxBinaryHeap {
    private int[] values = null;
    private int index = 0;
    
    public MaxBinaryHeap(int size){
        values = new int[size];
    }

    /**
     * will bubbleUp latest value to top position until the parent is bigger / become the root(if the number is larger than other number)
     * @param val
     * @return
     */
    public int insert(int val){
        values[index++] = val;

        int currentIndex = lastPosition();
        int parentIndex = findParent(currentIndex);
        while(val > values[parentIndex]){
            int temp = values[parentIndex];
            values[parentIndex] = val;
            values[currentIndex] = temp;
            currentIndex = parentIndex;
            parentIndex = findParent(parentIndex);
        }

        return val;
    }

    /**
     * remove largest value (parent root) from binaryHeap, and swap last element to parent root, then rearrange the values
     * @param val
     * @return
     */
    public void extractMax(){
        int currentIndex = lastPosition();
        int currentParent = 0;
        values[currentParent] = values[currentIndex];
        values[currentIndex] = 0; 
        index--;
        while(findLeftChild(currentParent) < values.length && findRightChild(currentParent) < values.length){

            boolean isLeft = values[findLeftChild(currentParent)] > values[findRightChild(currentParent)];
            boolean isRight = values[findLeftChild(currentParent)] < values[findRightChild(currentParent)];

            if(isLeft){
                if(values[currentParent] < values[findLeftChild(currentParent)]){
                    int temp = values[currentParent];
                    values[currentParent] = values[findLeftChild(currentParent)];
                    values[findLeftChild(currentParent)] = temp;
                    currentParent = findLeftChild(currentParent);
                    continue;    
                }
            }

            if(isRight){
                if(values[currentParent] < values[findRightChild(currentParent)]){
                    int temp = values[currentParent];
                    values[currentParent] = values[findRightChild(currentParent)];
                    values[findRightChild(currentParent)] = temp;
                    currentParent = findRightChild(currentParent);
                    continue;    
                }
            } 
        }
    }

    public void print(){
        for(Integer i : values){
            System.out.print( i + ", ");
        }
        System.out.println();
    }

    private int findLeftChild(int fromPosition){
        return (2 * fromPosition) + 1;
    }

    private int findRightChild(int fromPosition){
        return (2 * fromPosition) + 2;
    }

    /**
     * find next parentPosition from given index
     * @param fromPosition
     * @return
     */
    private int findParent(int fromPosition){
        return (fromPosition - 1) / 2;
    }

    /**
     * find position last inserted value
     * @return
     */
    private int lastPosition(){
        return index - 1;
    }

    public int[] getValues(){
        return this.values;
    }

    public static void main(String[] args){
        MaxBinaryHeap heap = new MaxBinaryHeap(10);
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        heap.insert(18);
        heap.insert(27);
        heap.insert(12);
        heap.insert(55);
        heap.insert(1);
        heap.print();
    }
}
public class SegmentTree<E> {
    /**
     * 数组实现线段树
     */

    private E[] data;
    private E[] tree;


    public SegmentTree(E[] arr){
        data = (E[])new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }

        tree = (E[]) new Object[4 * arr.length];
    }

    public int getSize(){
        return data.length;
    }


    public E get(int index){
        if (index < 0 || index >= data.length)
            throw new IllegalArgumentException("Unexpected Index, index run out of the range");

        return data[index];
    }


    // 返回完全二叉树的数组表示中，一个索引所代表的左孩子的索引
    private int leftChild(int index){
        return 2*index + 1;
    }

    // 返回完全二叉树的数组表示中国，一个索引所代表的右孩子的索引
    private int rightChild(int index){
        return 2*(index + 1);
    }




}

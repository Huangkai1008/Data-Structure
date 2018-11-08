public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    // 返回堆中的元素个数
    public int size() {
        return data.getSize();
    }

    // 返回一个布尔值，表示堆中是否为空
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的父亲节点的索引
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        }

        return (index - 1) / 2;
    }


    // 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index) {
        return index * 2 + 2;
    }


    // 在堆中添加元素
    public void add(E e) {
        data.addLast(e);
        // 上浮索引值为k的元素
        siftUp(data.getSize() - 1);
    }


    // 堆元素的上浮
    private void siftUp(int k) {
        // 加入的元素和父亲节点作比较，为了保证堆的性质不被破坏,如果加入元素
        // 大于插入的节点父亲元素的值
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            // 交换元素
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    // 查看堆中的最大元素
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("The heap is Empty!");
        }
        return data.get(0);
    }

    // 取出堆中的最大元素
    public E extractMax() {
        E ret = findMax();

        data.swap(0, data.getSize() - 1);
        data.removeLast();
        siftDown(0);

        return ret;

    }

    // 堆元素的下沉
    public void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {

            int j = leftChild(k);

            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = rightChild(k);
            }

//            data[j]是leftChild和rightChild中的最大值

            if (data.get(k).compareTo(data.get(j)) >= 0)
                break;

            data.swap(k, j);

            k = j;
        }
    }


}

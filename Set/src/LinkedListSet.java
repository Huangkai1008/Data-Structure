public class LinkedListSet<E> implements Set<E> {
    private LinkedList<E> list;

    public LinkedListSet(){
        list = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        // 不可添加重复的元素
        if(!list.contains(e))
            list.addFirst(e);
    }

    @Override
    public void remove(E e) {
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize(){
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


}

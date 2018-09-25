public class LinkedListStack<E> implements Stack<E> {
    /**
     * 链表实现的栈结构
     */
    private LinkedList<E> list;

    public LinkedListStack(){
         list = new LinkedList<>();
    }


    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("top ");
        res.append(list);
        return res.toString();
    }
}

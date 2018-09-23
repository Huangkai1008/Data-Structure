public interface Stack<E> {
    int getSize();

    boolean isEmpty();

    // 向栈中添加元素
    void push(E e);

    // 从栈中取出元素
    E pop();

    // 查看栈顶元素
    E peek();
}

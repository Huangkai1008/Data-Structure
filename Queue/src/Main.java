public class Main {

    public static void main(String[] args) {
        // write your code here
//        ArrayQueue<Integer> queue = new ArrayQueue<>();
//        for (int i = 0; i < 10; i++) {
//            queue.enqueue(i);
//            System.out.println(queue);
//            if (i % 3 == 2){
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }

//        LoopQueue<Integer> queue = new LoopQueue<>();
//        for (int i = 0; i < 10; i++) {
//            queue.enqueue(i);
//            System.out.println(queue);
//
//            if (i % 3 == 2) {
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 5; i++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);
            if (i % 3 == 2) {
                linkedListQueue.dequeue();
                System.out.println(linkedListQueue);
            }
            }


        }
    }

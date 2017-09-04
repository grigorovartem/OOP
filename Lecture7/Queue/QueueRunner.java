package Lecture7.Queue;

public class QueueRunner {
    public static void main(String[] args) {

        System.out.println("DynamicArrayQueue");
        Queue<Integer> dynamicArrayQueue = new DynamicArrayQueue<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        dynamicArrayQueue.offer(11);
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.remove());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.poll());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.element());
        System.out.println(dynamicArrayQueue.peek());
        System.out.println("size " + dynamicArrayQueue.size());
        System.out.println(dynamicArrayQueue.isEmpty());
        System.out.println(dynamicArrayQueue.contains(8));
        System.out.println(" ");

        System.out.println("LinkedQueue");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.offer(15);
        linkedQueue.offer(25);
        linkedQueue.offer(35);
        linkedQueue.offer(45);
        linkedQueue.print(linkedQueue);
        linkedQueue.offer(55);
        linkedQueue.print(linkedQueue);
        System.out.println("size " + linkedQueue.size());
        System.out.println(linkedQueue.remove());
        linkedQueue.print(linkedQueue);
        System.out.println("size " + linkedQueue.size());
        System.out.println(linkedQueue.poll());
        linkedQueue.print(linkedQueue);
        System.out.println("size " + linkedQueue.size());
        System.out.println(linkedQueue.element());
        linkedQueue.print(linkedQueue);
        System.out.println(linkedQueue.peek());
        linkedQueue.print(linkedQueue);
        System.out.println("size " + linkedQueue.size());
        System.out.println(linkedQueue.isEmpty());
        System.out.println(linkedQueue.contains(20));
        System.out.println(" ");

        System.out.println("LinkedListQueue");
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.offer(15);
        linkedListQueue.offer(25);
        linkedListQueue.offer(35);
        linkedListQueue.offer(45);
        linkedListQueue.print(linkedListQueue);
        linkedListQueue.offer(55);
        linkedListQueue.print(linkedListQueue);
        System.out.println("size " + linkedListQueue.size());
        System.out.println(linkedListQueue.remove());
        linkedListQueue.print(linkedListQueue);
        System.out.println("size " + linkedListQueue.size());
        System.out.println(linkedListQueue.poll());
        linkedListQueue.print(linkedListQueue);
        System.out.println("size " + linkedListQueue.size());
        System.out.println(linkedListQueue.element());
        linkedListQueue.print(linkedListQueue);
        System.out.println(linkedListQueue.peek());
        linkedListQueue.print(linkedListQueue);
        System.out.println("size " + linkedListQueue.size());
        System.out.println(linkedListQueue.isEmpty());
        System.out.println(linkedListQueue.contains(20));
    }
}

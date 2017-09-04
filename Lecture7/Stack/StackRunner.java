package Lecture7.Stack;

public class StackRunner {
    public static void main(String[] args) {

        DynamicArrayRealisation<Integer> dynamicArrayRealisation = new DynamicArrayRealisation<>(0,1,2,3,4,5,6,7,8,9,10);

        System.out.println("DynamicArray Runner");
        dynamicArrayRealisation.push(11);
        System.out.println("size " + dynamicArrayRealisation.size());
        System.out.println(dynamicArrayRealisation.pop());
        System.out.println("size " + dynamicArrayRealisation.size());
        System.out.println(dynamicArrayRealisation.peek());
        System.out.println(dynamicArrayRealisation.isEmpty());
        System.out.println(" ");

        System.out.println("LinkedStack Runner");
        LinkedStack<Integer> linkedStack = new LinkedStack<>(10, 20, 30, 40, 50);
        linkedStack.push(60);
        System.out.println("size " + linkedStack.size());
        System.out.println(linkedStack.pop());
        System.out.println("size " + linkedStack.size());
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.isEmpty());
        System.out.println(" ");

        System.out.println("LinkedList Runner");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>(20, 21);
        linkedListStack.push(25);
        System.out.println("size " + linkedListStack.size());
        System.out.println(linkedListStack.pop());
        System.out.println("size " + linkedListStack.size());
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.isEmpty());
        System.out.println(" ");
    }
}

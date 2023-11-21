import java.util.Arrays;
class Stack<T> {
    private T[] data;
    private int size = 0;

    public Stack () {
        this(16);
    };
    public Stack (int capacity) {
        data = (T[]) new Object[capacity];
    };

    public T peek() {
        return data[(size - 1)];
    };

    public T pop() {
        if (size == 0) {
            return null;
        }
        size--;
        T savedData = data[size];
        data[size] = null;
        return savedData;
    }

    public void push(T newElement) {
        if (size == data.length) {
            data = Arrays.copyOf(data, 2 * data.length);
        }
        data[size] = newElement;
        size++;
    };

    public boolean isEmpty() {
        return size == 0;
    };

    public int getSize() {
        return size;
    };
};

class Main
{
    public static void main (String[] args)
    {
        Stack myStack = new Stack<Integer>(3);

        myStack.push(1);
        myStack.push(2);

        System.out.println("The stack size is " + myStack.getSize());
        myStack.pop();

        System.out.println("The top element is " + myStack.peek());
        myStack.pop();
        myStack.push(3);

        System.out.println("The top element is " + myStack.peek());
        System.out.println("The stack size is " + myStack.getSize());
        myStack.pop();

        System.out.println(myStack.isEmpty()?"The stack is empty":"The stack is not empty");
        myStack.push(4);

        System.out.println(myStack.isEmpty()?"The stack is empty":"The stack is not empty");
    }
}
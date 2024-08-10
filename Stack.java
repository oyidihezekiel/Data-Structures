public class Stack {



        int size;

        int top;

        int[] array;

        Stack(int capacity){
            top = -1;
            size = capacity;
            array = new int[size];
        }

        boolean isFull () {
            return (top == size - 1);
        }

        boolean isEmpty () {
            return (top == -1);
        }


        void push ( int item){
            if (isFull()) {
                System.out.println("Stack overflow");
            } else {
                array[++top] = item;
                top++;
            }
        }

        void pop () {
            int previousTop = top;
            if (isEmpty()) {
                System.out.println("Stack underflow");
            } else {
                top--;
            }
            return;
        }


}
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        if(root == null){
            root = new StackNode(data);
            return;
        }
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    }

    public int pop() {
        if(root == null){
            System.out.println("Stack Overflow");
            return 0;
        }
        int value = root.data;
        root = root.next;
        return value;
    }

    public int peek() {
        if(root == null)
            return 0;
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 

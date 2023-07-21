public class Queue {

    private static Integer[] arr = new Integer[8];
    private static Integer front;
    private static Integer rear;
    private static Integer length;


    public Queue() {
        for (int i = 0; i < 8; i++) {
            arr[i] = -1;
        }
        length = 0;
        front = 0;
        rear = 0;
    }

    public void insert(Integer i) {
        if (rear > 8) {
            System.out.println("Queue is full");
        } else {
            arr[rear] = i;
            rear++;
            length++;
        }
    }

    public void delete() {
        if (length == 0) {
            System.out.println("Queue is empty ");
        } else {
            System.out.println("Deleted:" + arr[front]);
            front++;
            length--;
        }
    }
}

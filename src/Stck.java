public class Stck {
    private static Integer[] arr = new Integer[8];
    private static Integer top;

    public Stck() {
        for (int i = 0; i < 8; i++) {
            arr[i] = -1;
        }
        top = -1;
    }

    public static void push(Integer i) {
        if (top > 8) {
            System.out.println("Overflown");
        } else {
            top = top + 1;
            arr[top] = i;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Element that is popped is:" + arr[top]);
            arr[top] = -1;
            top = top - 1;
        }
    }
}

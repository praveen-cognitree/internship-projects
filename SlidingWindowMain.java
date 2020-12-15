package slidingwindow;

import java.util.Scanner;

public class SlidingWindowMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int size = sc.nextInt();
        System.out.println("enter the window size");
        int windowSize = sc.nextInt();
        SlidingWindow<Integer> iterator = new SlidingWindow<Integer>(windowSize);
        System.out.println("enter elements");
        while (size > 0) {
            iterator.add(sc.nextInt());
            size--;
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

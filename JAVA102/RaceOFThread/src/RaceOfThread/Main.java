package RaceOfThread;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> wholeList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            wholeList.add(i);
        }

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> doubleList = new ArrayList<>();

        List<Integer> dividedList1 = wholeList.subList(1, 2500);
        List<Integer> dividedList2 = wholeList.subList(2500, 5000);
        List<Integer> dividedList3 = wholeList.subList(5000, 7500);
        List<Integer> dividedList4 = wholeList.subList(7500, 10000);

        DoubleEven de = new DoubleEven(dividedList1, evenList, doubleList);
        Thread t1 = new Thread(de);
        t1.start();

        DoubleEven de2 = new DoubleEven(dividedList2, evenList, doubleList);
        Thread t2 = new Thread(de2);
        t2.start();

        DoubleEven de3 = new DoubleEven(dividedList3, evenList, doubleList);
        Thread t3 = new Thread(de3);
        t3.start();

        DoubleEven de4 = new DoubleEven(dividedList4, evenList, doubleList);
        Thread t4 = new Thread(de4);
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(doubleList);
        System.out.println(evenList);

    }
}

package RaceOfThread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DoubleEven implements Runnable{
    List<Integer> dividedList;
    List<Integer> evenList;
    List<Integer> doubleList;

    public DoubleEven(List<Integer> dividedList, List<Integer> evenList, List<Integer> doubleList) {
        this.dividedList = dividedList;
        this.evenList = evenList;
        this.doubleList = doubleList;
    }

    @Override
    public void run() {
        Iterator<Integer> itr = dividedList.iterator();
        while (itr.hasNext()){
            Integer i = itr.next();
            if(i%2 == 0){
                doubleList.add(i);
            }
            else {
                evenList.add(i);
            }
        }
    }
}

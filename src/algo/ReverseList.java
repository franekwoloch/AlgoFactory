package algo;

import java.util.ArrayList;
import java.util.List;

public class ReverseList implements Algo {
    List<Integer> list;
    List<Integer> reversedList=new ArrayList<>();

    public ReverseList(){
        list=List.of(1,2,3,4,5,6,7,8,9,10);
    }

    @Override
    public String getName(){
        return "ReverseList";
    }

    @Override
    public void infoAlgo() {
        System.out.println("Algorithmn reverses list");
    }

    @Override
    public void inputAlgo() {
        System.out.println("Input data");
        for (Integer n:list){
            System.out.println(n);
        }
    }

    @Override
    public void runAlgo() {
        int listLength =list.size();
        for (int i=0;i<listLength;i++) {
            reversedList.add(list.get((listLength - i - 1)));
        }
    }

    @Override
    public void resultsAlgo() {
        System.out.println("Output data");
        for (Integer n:reversedList){
            System.out.println(n);
        }
    }
}

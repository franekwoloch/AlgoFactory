package algo;

import java.util.LinkedList;

public class ReverseLinkedList implements Algo {

    LinkedList<Integer> linkedList;

    public ReverseLinkedList() {
        linkedList=new LinkedList<>();

    }

    @Override
    public String getName(){
        return "ReverseLinkedList";
    }

    @Override
    public void infoAlgo() {
        System.out.println("algo.Algo reversing linked list");
    }

    @Override
    public void inputAlgo() {
        System.out.println("Input data for reverse LinkedList:");
        for (int i=0; i<20; i++){
            linkedList.add(i);
            System.out.println(linkedList.get(i));
        }
    }

    @Override
    public void runAlgo() {
        int size=linkedList.size();
        if (size!=0){
            for  (int i=0; i<size;i++){
                linkedList.addFirst(linkedList.getLast());
                linkedList.removeLast();
            }
        }
    }

    @Override
    public void resultsAlgo() {
        System.out.println("Output data for reverse LinkedList:");
        for (int i=0; i<linkedList.size(); i++){
             System.out.println(linkedList.get(i));
        }
    }
}

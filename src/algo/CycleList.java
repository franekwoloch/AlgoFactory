package algo;

import java.util.LinkedList;

public class CycleList implements Algo {

    LinkedList<Integer> cycleList=new LinkedList<>();
    LinkedList<Integer> noCycleList=new LinkedList<>();
    boolean isCycleCycleList;
    boolean isCycleNoCycleList;


    public CycleList() {
    }

    @Override
    public String getName(){
        return "CycleList";
    }

    @Override
    public void infoAlgo() {
        System.out.println("Algorithm checking cycle of linked list");

    }

    @Override
    public void inputAlgo() {
        System.out.println("Linked list with cycle: ");
        createCycle();
        printList(cycleList);
        System.out.println("Linked list with no cycle: ");
        createNoCycle();
        printList(noCycleList);
    }

    @Override
    public void runAlgo() {
        System.out.println("Checking cycle list:.. .");
        isCycleCycleList=isCycle(cycleList);
        isCycleNoCycleList=isCycle(noCycleList);

    }

    @Override
    public void resultsAlgo() {
        System.out.println("Cycle list is cycle?: "+isCycleCycleList);
        System.out.println("No cycle list is cycle?: "+isCycleNoCycleList);

    }

    public void createCycle(){
        for (int i=0;i<20;i++){
            int restFromScharingByTwo=i%2;
            cycleList.addFirst(restFromScharingByTwo);
        }
    }

    public void createNoCycle(){
        for (int i=0; i<20; i++){
            noCycleList.add(i);
        }
    }

    public void printList(LinkedList list){
        int length=list.size();
        for (int i=0;i<length; i++){
            System.out.println(list.get(i));
        }
    }

    public boolean isCycle(LinkedList list){
        boolean result=false;
        boolean run=true;
        int tartle;
        int hare;
        for (int i=0; (i<(list.size()/2))&&run;i++){
            tartle=i;
            hare=2*i;
            if (i>0&&(list.get(tartle)==list.get(hare))) {
                result= true;
                run=false;
            }
        }
        return result;
    }

}



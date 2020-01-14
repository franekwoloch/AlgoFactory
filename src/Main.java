public class Main {

    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println("Hello in Simply AlgoFactory 1.0.0");
        AlgoCreator algoCreator=new AlgoCreator();
        AlgoFactory algoFactory=new AlgoFactory(algoCreator);
        algoFactory.manufactureAlgo("algo.FizzBuzz");
        algoFactory.manufactureAlgo("algo.ReverseList");
        algoFactory.manufactureAlgo("algo.ReverseLinkedList");
        algoFactory.manufactureAlgo("algo.CycleList");
        Printer.sayGoodBye();
    }


}

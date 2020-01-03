public class Main {

    public static void main(String[] args) {
        System.out.println("Hello in Simply AlgoFactory 1.0.0");
        AlgoCreator algoCreator=new AlgoCreator();
        AlgoFactory algoFactory=new AlgoFactory(algoCreator);
        algoFactory.manufactureAlgo("FizzBuzz");
        algoFactory.manufactureAlgo("ReverseList");
        algoFactory.manufactureAlgo("ReverseLinkedList");
        System.out.println("Good bye!");

    }
}

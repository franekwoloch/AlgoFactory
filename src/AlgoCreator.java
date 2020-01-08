//implementation of Simply Factory Pattern

public class AlgoCreator {
    public Algo createAlgo(String type){
        if (type.equals("FizzBuzz")){
            return new FizzBuzz();
        }
        else if (type.equals("ReverseList")){
            return new ReverseList();
        }
        else if (type.equals("ReverseLinkedList")){
            return new ReverseLinkedList();
        }

        else if (type.equals("CycleList")){
            return new CycleList();
        }
        else {
            throw new IllegalArgumentException("Unknown type "+type );
        }
    }
}


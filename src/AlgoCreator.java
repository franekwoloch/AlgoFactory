//implementation of Simply Factory Pattern

import algo.*;

public class AlgoCreator {
    public Algo createAlgo(String type){
        if (type.equals("algo.FizzBuzz")){
            return new FizzBuzz();
        }
        else if (type.equals("algo.ReverseList")){
            return new ReverseList();
        }
        else if (type.equals("algo.ReverseLinkedList")){
            return new ReverseLinkedList();
        }

        else if (type.equals("algo.CycleList")){
            return new CycleList();
        }
        else {
            throw new IllegalArgumentException("Unknown type "+type );
        }
    }
}


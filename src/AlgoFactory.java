import algo.Algo;

public class AlgoFactory {
    AlgoCreator algoCreator;

    public AlgoFactory(AlgoCreator algoCreator) {
        this.algoCreator = algoCreator;
    }

    public void manufactureAlgo(String type){
        Algo algo=algoCreator.createAlgo(type);
        algo.infoAlgo();
        algo.inputAlgo();
        algo.runAlgo();
        algo.resultsAlgo();
    }
}

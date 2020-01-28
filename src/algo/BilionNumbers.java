package algo;

import data.Numbers;

public class BilionNumbers implements Algo {

    private Numbers numbers;

    public BilionNumbers() {
        numbers=new Numbers(1000);
    }

    @Override
    public void infoAlgo() {
        System.out.println("Algorithm sorted one bilion numbers");
    }

    @Override
    public void inputAlgo() {
        numbers.create();
        numbers.toString();
    }

    @Override
    public void runAlgo() {

    }

    @Override
    public void resultsAlgo() {

    }

    @Override
    public String getName() {
        return null;
    }
}

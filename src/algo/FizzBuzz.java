package algo;

import java.util.Arrays;

public class FizzBuzz implements Algo {

    int [] numbers= new int[100];


    public FizzBuzz() {
        int i;
        for (i = 0;i<100; i++) {
            numbers[i] = i;
        }
    }

    @Override
    public String getName(){
        return "FizzBuzz";
    }

    @Override
    public void infoAlgo() {
        System.out.println("algo.FizzBuzz algorithmn");

    }

    @Override
    public void inputAlgo() {
        System.out.println("Input data");
        System.out.println(Arrays.toString(numbers));
        }

    public void Fizz(){
        for (int i=0; i<100; i++){
            if (numbers[i]%3==0)
            System.out.println("i="+i+" - Fizz!");
        }
    }

    public void Buzz(){
        for (int i=0; i<100; i++){
            if (numbers[i]%5==0)
            System.out.println("i="+i+" - Buzz!");
        }
    }

    public void FizzBuzz(){
        for (int i=0; i<100; i++){
            if (numbers[i]%15==0)
            System.out.println("i="+i+" - algo.FizzBuzz!");
        }
    }

    @Override
    public void runAlgo() {

    }

    @Override
    public void resultsAlgo() {
        Fizz();
        Buzz();
        FizzBuzz();
    }
}

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
        interfaceChecker();

    }

    public static void interfaceChecker() throws ClassNotFoundException {
        System.out.println("Checking interfaces.....");
        String className="algo.FizzBuzz";
        Class c = Class.forName(className);
        System.out.println(c.getName());
        System.out.println("???");
        Class[] classes = c.getInterfaces();
        System.out.println(classes.length);

    }
}

class Counter {
    static int count = 0; // Static variable shared by all objects

    static void increment() {
        count++;
    }
}

public class StaticVariableExample {

    public static void main(String[] args) {
        Counter.increment();
        System.out.println("Count after first increment: " + Counter.count);

        Counter.increment();
        System.out.println("Count after second increment: " + Counter.count);

        Counter.increment();
        System.out.println("Count after third increment: " + Counter.count);
    }
}

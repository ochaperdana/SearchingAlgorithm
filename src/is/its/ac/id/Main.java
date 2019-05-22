package is.its.ac.id;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] data1 = {199, 200, 1, 15, 100, 500, 1001, 1002, 1006};
        String[] data2 = {"Alayka", "Sumi", "Ati", "Zulaikha", "Alif", "Firman"};

        //Experiment 1: Linear Search
        System.out.println("Experiment 1:");

        Search s = new LinearSearch("Linear Search");

        // Over Data 1
        System.out.println("Data 1:");
        s.printData(data1);
        System.out.println();
        int key1 = 1006;
        System.out.println("Key:" + key1);
        double start = System.nanoTime();
        boolean found = s.doSearch(key1, data1);
        double end = System.nanoTime();
        double timesTaken = end - start;

        String status;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key1 + "' is " + status + " using " + s.printName() + " times required:" + timesTaken + " (in nanoseconds)");

        // Over Data 2
        System.out.println("Data 2:");
        s.printData(data2);
        System.out.println();
        String key2 = "Firman";
        System.out.println("Key:" + key2);

        start = System.nanoTime();
        found = s.doSearch(key2, data2);
        end = System.nanoTime();
        timesTaken = end - start;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key2 + "' is " + status + " using " + s.printName() + " times required:" + timesTaken + " (in nanoseconds)");


        //Experiment 2: Binary Search
        //Complete your code here!
        System.out.println("\nExperiment 2:");

        Search b = new BinarySearch("Binary Search");
        // Over Data 1
        System.out.println("Data 1:");
        b.printData(data1);
        System.out.println();
        int key3 = 100;
        System.out.println("Key:" + key3);

        start = System.nanoTime();
        found = b.doSearch(key3, data1);
        end = System.nanoTime();
        timesTaken = end - start;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key3 + "' is " + status + " using " + b.printName() + " times required:" + timesTaken + " (in nanoseconds)");

        // Over Data 2
        System.out.println("Data 2 : ");
        b.printData(data2);
        System.out.println();
        String key4 = "Fifi";
        System.out.println("Key:" + key4);

        start = System.nanoTime();
        found = b.doSearch(key4, data2);
        end = System.nanoTime();
        timesTaken = end - start;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key4 + "' is " + status + " using " + b.printName() + " times required:" + timesTaken + " (in nanoseconds)");


        //Experiment 3: Jump Search
        //Complete your code here!
        System.out.println("\nExperiment 3:");

        Search j = new JumpSearch("Jump Search");
        // Over Data 1
        System.out.println("Data 1:");
        j.printData(data1);
        System.out.println();
        int key5 = 1002;
        System.out.println("Key:" + key5);

        start = System.nanoTime();
        found = j.doSearch(key5, data1);
        end = System.nanoTime();
        timesTaken = end - start;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key5 + "' is " + status + " using " + j.printName() + " times required:" + timesTaken + " (in nanoseconds)");

        // Over Data 2
        System.out.println("Data 2 : ");
        j.printData(data2);
        System.out.println();
        String key6 = "Firman";
        System.out.println("Key:" + key6);

        start = System.nanoTime();
        found = j.doSearch(key6, data2);
        end = System.nanoTime();
        timesTaken = end - start;

        if (found) {
            status = "found";
        } else {
            status = "not found";
        }
        System.out.println("the key '" + key6 + "' is " + status + " using " + j.printName() + " times required:" + timesTaken + " (in nanoseconds)");
    }
}

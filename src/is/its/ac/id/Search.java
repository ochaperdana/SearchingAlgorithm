package is.its.ac.id;

public abstract class Search {
    String name;

    Search(String n) {
        name = n;
    }

    abstract boolean doSearch(String s, String[] data);

    abstract boolean doSearch(int s, int[] data);

    String printName() {
        return name;
    }

    void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    void printData(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

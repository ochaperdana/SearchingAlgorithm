package is.its.ac.id;

public class LinearSearch extends Search {
    LinearSearch(String name) {
        super(name);
    }

    @Override
    boolean doSearch(String s, String[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    boolean doSearch(int s, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == s) {
                return true;
            }
        }
        return false;
    }
}

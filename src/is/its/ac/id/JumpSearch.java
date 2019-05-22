package is.its.ac.id;

public class JumpSearch extends Search {

    JumpSearch(String name) {
        super(name);
    }

    @Override
    boolean doSearch(String s, String[] data) {
        Sort a = new Sort();
        a.doSort(data);

        Search b = new LinearSearch("Linear");
        int val;
        if (b.doSearch(s, data)) {
            val = 1;
        } else {
            val = 0;
        }

        int str = 0;
        int end = (int) Math.sqrt(data.length);
        int r = s.compareTo(data[Math.min(end, data.length) - 1]);

        while (!data[Math.min(end, data.length) - 1].equals(s) && end < data.length) {
            str = end;
            end += Math.sqrt(data.length);
            if (end >= data.length) {
                end = data.length;
            }
        }

        for (int i = str; i < end; i++) {
            if (data[i].equals(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    boolean doSearch(int s, int[] data) {
        Sort a = new Sort();
        a.doSort(data);

        int str = 0;
        int end = (int) Math.sqrt(data.length);

        while (data[Math.min(end, data.length) - 1] < s) {
            str = end;
            end += Math.sqrt(data.length);
            if (end >= data.length) {
                end = data.length;
            }
        }

        for (int i = str; i < end; i++) {
            if (data[i] == s) {
                return true;
            }
        }

        return false;
    }
}

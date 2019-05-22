package is.its.ac.id;

public class BinarySearch extends Search {

    BinarySearch(String name) {
        super(name);
    }

    @Override
    boolean doSearch(String s, String[] data) {
        Sort a = new Sort();
        a.doSort(data);

        //complete your code here
        int l = 0;
        int h = data.length - 1;
        int m;

        m = (l + h) / 2;
        while (l <= h) {
            if (s.compareTo(data[m]) == 0) {
                return true;
            } else if (s.compareTo(data[m]) > 0) {
                l = m + 1;
            } else {
                h = m - 1;
            }
            m = (l + h) / 2;
        }

        return false;
    }

    @Override
    boolean doSearch(int s, int[] data) {
        Sort a = new Sort();
        a.doSort(data);

        int low = 0;
        int high = data.length - 1;
        int mid;

        mid = (low + high) / 2;
        while (low <= high) {
            if (data[mid] == s) {
                return true;
            } else if (data[mid] < s) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return false;
    }
}

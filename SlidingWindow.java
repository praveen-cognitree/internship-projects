package slidingwindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SlidingWindow<T> implements Iterator<List<T>> {

    private final List<T> list = new ArrayList<T>();
    private int start = 0;
    private int end;

    SlidingWindow(int windowSize) {
        end = windowSize;
    }

    public void add(T item) {
        list.add(item);
    }

    public boolean hasNext() {
        return end - 1 < list.size();
    }

    public List<T> next() {
        List<T> elements = new ArrayList<T>();
        for (int i = start; i < end; i++) {
            elements.add(list.get(i));
        }
        start++;
        end++;
        return elements;
    }

    public void remove() {
    }

}

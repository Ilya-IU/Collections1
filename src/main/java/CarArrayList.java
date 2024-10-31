import java.util.Arrays;

import static java.util.Objects.checkFromIndexSize;
import static java.util.Objects.checkIndex;

public class CarArrayList implements CarList {
    private Car[] array = new Car[10];
    private int size = 0;
    @Override
    public Car getIndex(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void add(Car car) {
        if (size >= array.length){
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = car;

    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size-1; i++) {
            if (array[i].equals(car)) {
                return revoveAt(i);

            }
        }
        return false;
    }

    @Override
    public boolean revoveAt(int index) {
        checkIndex(index);
        for (int i = index; i < size-1 ; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Car[10];

    }
    private void checkIndex(int index) {
        if (index <0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}

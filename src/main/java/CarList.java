public interface CarList {
    Car getIndex(int index);
    void add(Car car);
    boolean remove(Car car);
    boolean revoveAt(int index);
    int size();
    void clear();

}

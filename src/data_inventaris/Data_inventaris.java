package data_inventaris;

// Kelas generik untuk item inventaris
public class Data_inventaris<T> {
    private T item;
    
    public Data_inventaris(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
    
    public void setItem(T item) {
        this.item = item;
    }
    
    @Override
    public String toString() {
        return item.toString();
    }
}

package HomeWork4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> {
    private E[] data;

    DataContainer(E[] item) {
        this.data = item;
    }

    void add(E item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return;
            }

        }
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
    }

    E[] getData() {
        return this.data;

    }

    static <E> void sort(DataContainer<E> item, Comparator<E> comparator) {
        E bubble;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < item.getData().length - 1; i++) {
                if (comparator.compare(item.getData()[i], item.getData()[i + 1]) == 0) {
                    isSorted = false;
                    bubble = item.getData()[i];
                    item.getData()[i] = item.getData()[i + 1];
                    item.getData()[i + 1] = bubble;
                }
            }
        }
    }

    void delete(int index) {
        if ((index > data.length - 1 || (index < 0))) {
            System.out.println("no such index");
            return;
        }
        for (int i = index; i < data.length - 1; i++)
            data[i] = data[i + 1];
        data = Arrays.copyOf(data, data.length - 1);
    }

    void delete(E item) {
        int index = -1;
        for (int i = 0; i < data.length - 1; i++)
            if (data[i].hashCode() == item.hashCode()) {
                index = i;
                break;
            }
        if (index != -1) delete(index);
        else System.out.println("no such element");
    }
}






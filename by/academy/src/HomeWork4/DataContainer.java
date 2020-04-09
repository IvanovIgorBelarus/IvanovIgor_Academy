package HomeWork4;


import java.util.Arrays;

public class DataContainer<E extends Object> {
    private E[] item;

    // ArrayList<E>data=new ArrayList<>();
    public DataContainer(E[] item) {
        this.item = item;
    }

    public void add(E[] item) {
        for (int i=0; i<this.item.length;i++) {
            if (item[i] != null) {
                this.item[i] = item[i];
                return;
            }

        }
        this.item=Arrays.copyOf(this.item,this.item.length+1);
        this.item[this.item.length-1]=item[this.item.length-1];
    }


    public void getData() {
        for (E item : item) {
            for (int i=0;i<10;i++)
            System.out.print(item+". ");
            System.out.println();
        }
    }

//    public void getData(){
//         for (Object data: data) {
//             for (int i=0;i<10;i++){
//             System.out.print(data.toString());}
//             System.out.println();
//         }
//     }

}

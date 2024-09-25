package custom;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList {
    private Object[] arr;
    private int size;
    private final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        CustomList<String> strs = new CustomArrayList();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add(i+"index");
        }
        System.out.println(strs);
        System.out.println(strs.get(5));
        strs.remove(2);
        System.out.println(strs);
        strs.add("df");
        System.out.println(strs);
        strs.remove("0index");
        System.out.println(strs);
    }

    public CustomArrayList() {
        arr = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public String toString() {
        return "arr= " + Arrays.toString(arr) + ", size= " + size;
    }

    @Override
    public void add(Object item){
        Object[] before = arr;
        if(size == arr.length) arr = new Object[arr.length+1];
        arr[size++] = item;
        if(before == arr) return;
        for(int i = 0; i < before.length; i++){
            arr[i] = before[i];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        for(int i = 0; i < size; i++){
            if(index == i){
                size -= 1;
                for(int j = i; j < size; j++){
                    arr[j] = arr[j+1];
                    if(j+1 == size){
                        Object[] before = arr;
                        arr = new Object[arr.length-1];
                        for(int q = 0; q < arr.length; q++){
                            arr[q] = before[q];
                        }
                    }
                }
            }
        }
    }

    @Override
    public void remove(Object item) {
        for(int i = 0; i < size; i++){
            if(arr[i].equals(item)){
                size -= 1;
                for(int j = i; j < size; j++){
                    arr[j] = arr[j+1];
                    if(j+1 == size){
                        Object[] before = arr;
                        arr = new Object[arr.length-1];
                        for(int q = 0; q < arr.length; q++){
                            arr[q] = before[q];
                        }
                    }
                }
            }
        }
    }

    @Override
    public Object get(int index) {
        if(size <=index) return null;
        return arr[index];
    }
}

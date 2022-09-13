package linear;

public class ArrayList<E> implements List<E>{

    //Define data or attribute
    public static final int DEFAULT_CAPACITY = 4;
    private int size; //the number of elements in list
    private E[] elements;

    public ArrayList(){

        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E get(int index) {

        return this.elements[index];
    }

    @Override
    public Object set(int index, Object newElement) {
        return null;
    }

    @Override
    public boolean add(E newElement) {

        if(this.size == this.elements.length){
            return false;
        }
        this.elements[this.size++] = newElement;
        return true;
    }

    @Override
    public boolean add(int index, E newElement) {
        return false;
    }

    @Override
    public boolean contain(E elements) {
        return false;
    }

    @Override
    public int indexOf(Object elements) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public String toString() {

        String a = "";
        for (E e : elements) {

            a = a + " " +e;
        }
        return a;
    }
}

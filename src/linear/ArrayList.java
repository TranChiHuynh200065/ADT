package linear;

import java.util.Arrays;

public class ArrayList<E> implements List<E>{

    //Define data or attribute
    public static final int DEFAULT_CAPACITY = 4;
    private int size = 0; //the number of elements in list
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

        if(true)
        {
            for(E e : elements){

                if(e != null){

                    return false;
                };
            }
        }
        return true;
    }

    @Override
    public E get(int index) {

        if(checkIndex(index)){

            return (E) ("\n" + this.elements[index]);

        }
        return (E) "\nIndex error!";
    }

    @Override
    public Object set(int index, Object newElement) {

        return null;
    }

    @Override
    public boolean add(E newElement) {

        if(this.size == this.elements.length){

            this.elements = grow();

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

            if(a.equals(""))
            {
                a = String.valueOf(e);
            }
            else{

                a = a + ", " +e;
            }
        }
        return "\n[" +a+ "]";
    }

    private E[] grow(){

        return Arrays.copyOf(this.elements, this.elements.length + 1);
    }

    private E[] shrink(){

        return Arrays.copyOf(this.elements, this.elements.length / 2);
    }

    private boolean checkIndex(int index){

        if(index < 0){

            return false;

        }else if(index >= elements.length){

            return false;

        }
        return true;
    }
}

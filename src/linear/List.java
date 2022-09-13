package linear;

public interface List<E> {
    
    public int size();
    public boolean isEmpty();
    public E get(int index);
    public E set(int index, E newElement); // return an old element
    public boolean add (E newElement);
    public boolean add (int index, E newElement);
    public boolean contain(E elements);
    public int indexOf(E elements);
    public E remove(int index);
}

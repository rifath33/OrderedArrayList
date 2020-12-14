public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
    for (int i = 0; i < size(); i++) {
      if (element.compareTo(this.get(i)) <= 0) {
        super.add(i, element);
        return(super.get(size()-1).equals(element));
      }
    }
      super.add(0, element);
      return(super.get(size()-1).equals(element));
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
    add(element);
  }

  public T set(int index, T element){
    T memory = get(index);
    remove(index);
    add(element);
    return memory;
  }

}

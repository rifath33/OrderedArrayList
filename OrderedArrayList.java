public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public int findIndex(T element){
    int index = 0;
    int stop = 0;
    for(int i = 0; i < size() && stop != 1; i++){
      if(get(i).compareTo(element) < 0)
      index++;
      if( (get(i).compareTo(element) > 0) || (get(i).compareTo(element) == 0) )
      index++;
      stop++;
    }
    return index;
  }

  public boolean add(T element){
    super.add(findIndex(element),element);
  }

  public void add(int index, T element){
    super.add(findIndex(element),element);
  }

  // public T set(int index, T element){
  //
  // }

}

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  
  public int indexOf(T element){
      int index = 0; 
      
      if(super.size() < 1)
      return 0;
      else{
          
          for(int i = 0; i < super.size(); i++){
              if(element.compareTo(super.get(i)) >= 0)
              index = i + 1;
          }
          
      }
      
      return index;
      
  }

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
      else{
        
        if(indexOf(element) > super.size()-1){
        super.add(element);
        return true;
        }
        else{
            super.add(indexOf(element),element);
            return true;
        }
        
      }
    
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
    
    if(indexOf(element) > super.size()-1){
      super.add(element);
    }
    else{
        super.add(index,element);
    }
    
  }

  public T set(int index, T element){
    T memory = get(index);
    remove(index);
    add(element);
    return memory;
  }

}

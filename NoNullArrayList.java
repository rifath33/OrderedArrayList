import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
    else{
      super.add(element);
      return(super.get(size()-1)==element);
    }
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException ("Elements cannot be null.");
    }
    else{
      super.add(index, element);
    }
  }

  // public T set(int index, T element){
  //
  // }

}

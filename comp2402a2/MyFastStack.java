package comp2402a2;

/**
 * This class implements the MyStack interface.
 * @author sharp
 *
 * @param <T> the type of objects stored in the MyStack
 */
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;


public class MyFastStack<T> implements MyStack<T> {
	ArrayList<T> MyStack = new ArrayList<>();

	public MyFastStack() {
	}

	public int size() {
    return MyStack.size();
	}

	public void push(T x) {
		//If there is no consecutive
		if( ( MyStack.size() == 0 ) || !(x.equals(MyStack.get(MyStack.size()-1))) ){
			MyStack.add(x);
		}else{
			//If there is a consecutive
			MyStack.remove(MyStack.size()-1);
		}
	}

	public T pop() {
		if( MyStack.size() == 0 ){ return null; }
    return MyStack.remove(MyStack.size()-1);
	}

	public String toString() {
		return MyStack.toString();
  }

}

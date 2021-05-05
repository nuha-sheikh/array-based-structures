package comp2402a2;

/**
 * This class implements the MyDeque interface.
 * @author sharp
 *
 * @param <T> the type of objects stored in the MyDeque
 */
import java.util.ArrayDeque;

public class MyFastDeque<T> implements MyDeque<T> {
	//ArrayList<T> MyStack = new ArrayList<>();
	ArrayDeque<T> MyStack = new ArrayDeque<>();

	public MyFastDeque() {
    // TODO: Your code goes here
	}

	public int size() {
    // TODO: Your code goes here
    return MyStack.size();
	}

	public void addFirst(T x) {
		//If there is no consecutive
		if( ( MyStack.size() == 0 ) || !(x.equals(MyStack.element())) ){
			MyStack.push(x);
		}else{
			//If there is a consecutive
			MyStack.remove();
		}
	}

	public void addLast(T x) {
		//If there is no consecutive
		if( ( MyStack.size() == 0 ) || !(x.equals(MyStack.peekLast())) ){
			MyStack.add(x);
		}else{
			//If there is a consecutive
			MyStack.pollLast();
		}
	}

	public T removeFirst() {
		if( MyStack.size() == 0 ){ return null; }
    return MyStack.remove();
	}

	public T removeLast() {
		if( MyStack.size() == 0 ){ return null; }
    return MyStack.pollLast();
	}

	public String toString() {
		return MyStack.toString();
  }


}

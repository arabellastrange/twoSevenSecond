package arrayList;
import java.util.*;

public class listStack<E> implements StackADT<E> {
		int top;
		ArrayList<E> S;
		
		public listStack(int capacity){
			top = -1;
			S = new ArrayList<E>(capacity);
		}

		public listStack(){
			top = -1;
			S = new ArrayList<E>(5);
		}
		
		public void push(E element){
		     top++;
		     S.add(element);
		}

		public E pop(){
			 E element;
		     if (isEmpty())
		        throw new EmptyStackException("Stack is empty, so cannot pop from stack");
		     element = S.get(top);
		     top--;
		     return element;
		}

		public E top(){
			 E element; 
			   if(isEmpty())
				   throw new EmptyStackException("Stack is empy so cannot read from stack");
			   element = S.get(top);
			   return element;
		}

		public int size(){
			return top++;
		}

		public boolean isEmpty(){
			 if(top < 0){
				  return true;
			  }
			  return false;
		}
}

package adapter;
import java.util.Stack;

public class StackStack<E> implements StackADT<E>{
	
	   protected Stack<E> S;
	   protected int stackSize=0;
	   
	   public StackStack(){
		   S = new Stack<E>();
	   }
	   
	   public void push(E element){
		   S.push(element);
	   }	
	   public E pop(){
		   S.pop();
		   return S.peek();
	   }
	   
	   public E top(){
		   return S.peek();
	   }

	   public int size(){
		   return S.size();
	   }

	   public boolean isEmpty(){
		   return S.empty();
	   }
}

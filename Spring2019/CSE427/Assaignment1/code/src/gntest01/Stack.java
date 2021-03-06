package gntest01;

public class Stack<T> {
	
	int size;
	StackElement<T> top;
	
	public Stack(){
		size = 0;
		top = null;
	}
	
	
	public int  push(T newValue){    /// it was void ///
		if(newValue == null){
			System.out.println("its null");
			StackElement<T> newElement = new StackElement<T>(newValue , top);
			top = newElement;
			size++;
			
		}
		else{
			StackElement<T> newElement = new StackElement<T>(newValue , top);
			top = newElement;
			size++;
			return 0 ;
			
		}
		
		return 1 ;
		
		
	}
	
	public T pop(){
		StackElement<T> oldTop = top;
		if(size==0){
			return null;
		}
		top = top.getNext();
		size -- ;
		return oldTop.getValue();
	}
	
	public T peek(){
		if(size == 0){
			return null;
		}
		return top.getValue();
	}
	
	
	public void empty(){
		size = 0;
		top = null;
	}
	
	public boolean isEmpty(){
		if(size  == 0){
			return true;
		}
		
		return false ;
		
	}
	
	public int getSize(){
		return size;
	}
	
	
	
	
	
	
	
	
	
	

}

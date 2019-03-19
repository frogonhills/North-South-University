package gntest01;

public class GenericStack {

	public static void main(String[] args){
		Stack<String> myStringStack = new Stack<String>();
		Stack<Integer> evm = new Stack<Integer>();
		
		myStringStack.push("alif");
		myStringStack.push("shifat");
		myStringStack.push("jafor");
		myStringStack.push("zubayer");
		
		
		System.out.println(myStringStack.peek());
		System.out.println(evm.isEmpty());
		System.out.println(myStringStack.peek());
		System.out.println(myStringStack.pop());
		System.out.println(myStringStack.peek());
	}

}

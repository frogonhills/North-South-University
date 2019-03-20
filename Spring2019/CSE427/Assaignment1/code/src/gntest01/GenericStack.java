package gntest01;

public class GenericStack {

	public static void main(String[] args){
		Stack<String> myStringStack = new Stack<String>();
		Stack<Integer> evm = new Stack<Integer>();
		Stack<Double> dvm = new Stack<Double>();
		Stack<Float> ft = new Stack<Float>();
		
		myStringStack.push("alif");
		myStringStack.push("shifat");
		myStringStack.push("jafor");
		myStringStack.push(null);
		evm.push(100);
		
		
		int A = 1000;
		String B = "something";
		double C = 12.6;
		float D = (float) 13.3;
		
		
		myStringStack.push(B);
		evm.push(A);
		dvm.push(C);
		ft.push(D);
		
		
		
		System.out.println(myStringStack.peek());
		System.out.println(evm.peek());
		System.out.println(dvm.peek());
		System.out.println(ft.peek());
		//System.out.println(evm.isEmpty());
		//System.out.println(myStringStack.peek());
		//System.out.println(myStringStack.pop());
		//System.out.println(myStringStack.peek());
		
	}

}

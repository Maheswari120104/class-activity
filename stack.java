import java.util.Stack;

public class stack {
	static Stack<Integer> st=new Stack<>();
	public static void insert(int a) {
		st.push(a);
		System.out.println("the inserted element is: "+st);
		
	}
	public static void remove() {
		if(!st.isEmpty()) {
			//int c=st.size()-1;
			int c=st.pop();
			System.out.println("undo the last element is:"+c);
		}
	}
	public static void display() {
		System.out.println("the remaining elements are: "+st);
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			insert(i);
		}
		remove();
		display();
	}
	

}

package h1;

public class H1_Main {
	
	public static void main(String[] args) {
		Node e = new Node(null);
		Node d = new Node(e);
		Node c = new Node(d);
		Node b = new Node(c);
		Node a = new Node(b);
		
		System.out.println("A: " + distance(a,a));
		System.out.println("A: " + distance(a,b));
		System.out.println("A: " + distance(a,c));
		System.out.println("A: " + distance(a,d));
		System.out.println("A: " + distance(a,e));
		System.out.println("B: " + distance(b,b));
		System.out.println("B: " + distance(b,c));
		System.out.println("B: " + distance(b,d));
		System.out.println("B: " + distance(b,e));
		System.out.println("C: " + distance(c,c));
		System.out.println("C: " + distance(c,d));
		System.out.println("C: " + distance(c,e));
		System.out.println("D: " + distance(d,d));
		System.out.println("D: " + distance(d,e));
		System.out.println("E: " + distance(e,e));
	}
	
	public static int distance(Node x, Node y) {
		if(x == y) {
			return 0;
		}else {
			return distance(x.getNext(),y) + 1;
		}
	}
}

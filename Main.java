//Code by Samarth Dave
import java.util.Scanner;
public class Main {
	static Scanner s;
	public static void main(String[] args) {
		System.out.println("Heap by Samarth Dave");
		s = new Scanner(System.in);
		MaxHeap<Integer> heap = new MaxHeap<>();
		int i = -1;
		do {
			out("1. Print\n2. Size\n3. Empty?\n4. Add\n5. Remove\n6. Clear\n0. Exit");
			i = validInt("Enter selection: ");
			switch(i) {
				case 1:
					out("The data in the heap is: " + heap + ".");
					break;
				case 2:
					out("The size of the heap is " + heap.size() + ".");
					break;
				case 3:
					out(heap.empty() ? "The heap is empty." : "The heap is not empty.");
					break;
				case 4:
					heap.add(validInt("Enter a value: "));
					break;
				case 5:
					if(heap.empty())
						out("Heap empty. You can't remove anything.");
					else
						out(heap.remove() + " was removed.");
					break;
				case 6:
					heap.clear();
					out("Heap was cleared.");
					break;
			}
		} while(i != 0);
		s.close();
		out("User exited.");
	}
	public static int validInt(String o) {
		int r = -1;
		System.out.print("\n"+o);
		while(!s.hasNextInt()) {
			System.out.print("Error, try again: ");
			s.next();
		}
		r = s.nextInt();
		return r;
	}
	public static void out(String s) {
		System.out.println("" + s);
	}
}
//Code by Samarth Dave
import java.util.ArrayList;
public class MaxHeap<E extends Comparable> {
	private ArrayList<E> al;
	public MaxHeap() {
		al = new ArrayList<>();
	}
	public boolean add(E item) {
		if(empty())
			return al.add(item);
		al.add(item);
		int pos = al.size()-1, b = (pos-1)/2;
		while(pos != 0) {
			if(al.get(pos).compareTo(al.get(b)) > 0) {
				tradePlaces(pos, b);
				pos = b;
				b = (pos-1)/2;
			} else break;
		}
		return true;
	}
	public void tradePlaces(int a, int b) {
		E v = al.get(a);
		al.set(a, al.get(b));
		al.set(b, v);
	}
	public E remove() {
//		only two states covered in remove
		if(empty())
			return null;
		if(size() == 1 || size() == 2)
			return al.remove(0);
		return null;
	}
	public boolean empty() {
		return size() == 0;
	}
	public int size() {
		return al.size();
	}
	public void clear() {
		al.clear();
	}
	public String toString() {
		return al+"";
	}
}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) throws IOException {
//		CopyList cpL = new CopyList();
//		LinkedList<Integer> cpL = new LinkedList<Integer>();
//		TestList<Integer> cpL = new TestList <Integer>();
		PeekList<Integer> cpL = new PeekList <Integer>();
//		StdList<Integer> cpL = new StdList<Integer>(1024);
		
		
		int num = 100, max = 100000;
		
		long startTime = System.nanoTime();
		for(int i = 0; i < max; i++) {
			cpL.add(i);
		}
//		for(int i = 0; i < 10; i++)
//			System.gc();
//		cpL2 = (PeekList<Integer>) cpL.clone();
//		for (int i = 0; i < max; i++) {
//			cpL.get(i);
//			cpL.SequentialGet();	// PeekList ¹öÀü
//		}
	
		String str = String.valueOf(System.nanoTime() - startTime);
		System.out.println(str);
		FileWrite(str, "Linked.txt");
	}
	
	public static void FileWrite(String str, String fileName) throws IOException {	
		BufferedWriter bw= new BufferedWriter(new FileWriter(fileName, true));
		PrintWriter pw = new PrintWriter(bw, true);
		
		pw.write(str +"\n");
		pw.flush();
		pw.close();
	}
}



//
//class ListTest <E>
//extends AbstractSequentialList<E>
//implements List<E>, Deque<E>, Cloneable, java.io.Serializable {
//	private transient Entry<E> header = new Entry<E>(null, null, null);
//	private transient int size = 0;
//	int index = 0;
//	
//	public ListTest() {
//		header.previous = header.next = header;
//	}
//
//	@Override
//	public void addFirst(E e) {
//		// TODO Auto-generated method stub
//		addBefore(e, header.next);
//	}
//
//	@Override
//	public void addLast(E e) {
//		// TODO Auto-generated method stub
//		addBefore(e, header);
//	}
//
//	@Override
//	public boolean offerFirst(E e) {
//		addFirst(e);
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean offerLast(E e) {
//		addLast(e);
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public E removeFirst() {
//		// TODO Auto-generated method stub
//		return remove(header.next);
//	}
//
//	@Override
//	public E removeLast() {
//		// TODO Auto-generated method stub
//		return remove(header.previous);
//	}
//
//	@Override
//	public E pollFirst() {
//		if(size == 0)
//			return null;
//		return removeFirst();
//	}
//
//	@Override
//	public E pollLast() {
//		if(size == 0)
//			return null;
//		return removeLast();
//	}
//
//	@Override
//	public E getFirst() {
//		if(size == 0)
//			return new NoSuchElementException();
//		
//		return header.next.element;
//	}
//
//	@Override
//	public E getLast() {
//		if(size == 0)
//			return new NoSuchElementException();
//		
//		return header.previous.element;
//	}
//
//	@Override
//	public E peekFirst() {
//		if (size==0)
//            return null;
//        return getFirst();
//	}
//
//	@Override
//	public E peekLast() {
//		if (size==0)
//			return null;
//    return getLast();
//	}
//
//	@Override
//	public boolean removeFirstOccurrence(Object o) {
//		return remove(o);
//	}
//
//	@Override
//	public boolean removeLastOccurrence(Object o) {
//		if (o==null) {
//            for (Entry<E> e = header.previous; e != header; e = e.previous) {
//                if (e.element==null) {
//                    remove(e);
//                    return true;
//                }
//            }
//        } else {
//            for (Entry<E> e = header.previous; e != header; e = e.previous) {
//                if (o.equals(e.element)) {
//                    remove(e);
//                    return true;
//                }
//            }
//        }
//        return false;
//	}
//
//	@Override
//	public boolean offer(E e) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public E remove() {
//		return add(e);
//	}
//
//	@Override
//	public E poll() {
//		if (size==0)
//            return null;
//        return removeFirst();
//	}
//
//	@Override
//	public E element() {
//		return getFirst();
//	}
//
//	@Override
//	public E peek() {
//		 if (size==0)
//	            return null;
//	        return getFirst();
//	}
//
//	@Override
//	public void push(E e) {
//		addFirst(e);
//	}
//
//	@Override
//	public E pop() {
//		return removeFirst();
//	}
//
//	@Override
//	public Iterator<E> descendingIterator() {
//		return new DescendingIterator();
//	}
//
//	@Override
//	public ListIterator<E> listIterator(int index) {
//		return new ListItr(index);
//	}
//
//	@Override
//	public int size() {
//		return size;
//	}
//	
//}

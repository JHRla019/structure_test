package team.dataStructure;

import java.util.LinkedList;


public class Test {

	public static void main(String[] args) {
		int cnt = 100000;
		long start;
		long end;
		
//		SinglyLinkedList		
//		SinglyCircularLinkedList
//		DoublyLinkedList
//		DoublyCircularLinkedList
		Family test = new DoublyLinkedList();
		
		start = System.nanoTime();
		for (int i = 0; i < cnt; i++) {
			test.addLast(i);
		}
		end = System.nanoTime();
		System.out.println(end - start);
	}

}

package team.dataStructure;

public class ExecutionTest {

	public static void main(String[] args) {
		Family list = new SinglyLinkedList();
//		SinglyLinkedList		
//		SinglyCircularLinkedList
//		DoublyLinkedList
//		DoublyCircularLinkedList
		
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		
		int size = list.size();

		System.out.print("===========size : " + list.size() + " ( ");
		for (int i = 0; i < size; i++) {
			System.out.print(i + " ");	
		}
		System.out.println(") =========== ");
		
		for (int i = 0; i < size; i++) {
			System.out.println("index : " + i);
			if(list instanceof DoublyCircularLinkedList || list instanceof DoublyLinkedList){
				System.out.println("prev : " + list.node(i).prev);
			}
			System.out.println("value : " + list.get(i));
			System.out.println("next : " + list.node(i).next);
			System.out.println("-----------");
		}
	}

}

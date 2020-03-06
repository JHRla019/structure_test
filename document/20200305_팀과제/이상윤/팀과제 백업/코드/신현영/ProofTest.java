package team.dataStructure;

public class ProofTest {

	public static void main(String[] args) {
		
		/*각 클래스에 따라서 prev, value, next값이 잘 작동하는지 확인 하는 클래스이다.*/
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
//		SinglyLinkedList		
//		SinglyCircularLinkedList
//		DoublyLinkedList
//		DoublyCircularLinkedList
		
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		
		int size = list.size();

		System.out.print("=========== size: " + list.size() + " ( ");
		for (int i = 0; i < size; i++) {
			System.out.print(i + " ");	
		}
		System.out.println(") =========== ");
		
		
		for (int i = 0; i < size; i++) {
			System.out.println("/// index : " + i);
//			if(list instanceof DoublyCircularLinkedList || list instanceof DoublyLinkedList){
				System.out.println("prev: "+ list.node(i).prev);
//			}
			System.out.println("value: " + list.get(i));
			System.out.println("next: " + list.node(i).next);
			System.out.println("-----------");
		}
	}

}

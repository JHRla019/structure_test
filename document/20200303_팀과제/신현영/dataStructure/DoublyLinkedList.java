package team.dataStructure;

public class DoublyLinkedList extends Family{
	
	@Override
	public void addFirst(Object input) {
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// head가 가지고 있는 주소값을 newNode next에 담습니다.
		newNode.next = head;
		// 기존에 노드가 있었다면 현재 헤드의 이전 노드로 새로운 노드를 지정합니다.
		if (head != null) {
			head.prev = newNode;
		}
		// 헤드로 새로운 노드를 지정합니다.
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	@Override
	public void addLast(Object input) {
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용하빈다.
		if (size == 0) {
			addFirst(input);
		} else {
			// tail의 다음 노드로 생성한 노드를 지정합니다.
			tail.next = newNode;
			// 새로운 노드의 이전 노드로 tail을 지정합니다.
			newNode.prev = tail;
			// 마지막 노드를 갱신합니다.
			tail = newNode;
			// 엘리먼트의 개수를 1 증가 시킵니다.
			size++;
		}
	}

	@Override
	public void add(int k, Object input) {
		// 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			// k 번째 노드를 temp2로 지정합니다.
			Node temp2 = temp1.next;
			// 새로운 노드를 생성합니다.
			Node newNode = new Node(input);
			// temp1의 다음 노드로 새로운 노드를 지정하빈다.
			temp1.next = newNode;
			// 새로운 노드의 다음 노드로 temp2를 지정하빈다.
			newNode.next = temp2;
			// temp2의 이전 노드로 새로운 노드를 지정합니다.
			if (temp2 != null)
				temp2.prev = newNode;
			// 새로운 노드의 이전 노드로 temp1을 지정합니다.
			newNode.prev = temp1;
			size++;
			// 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
			if (newNode.next == null) {
				tail = newNode;
			}

		}
	}
	
	@Override
	public Node node(int index) {
		// 노드의 인덱스가 전체 노드 수의 반보다 큰지 작은지 계산
		if (index < size / 2) {
			// head부터 next를 이용해서 인덱스에 해당하는 노드를 찾습니다.
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;
		} else {
			// tail부터 prev를 이용해서 인덱스에 해당하는 노드를 찾습니다.
			Node x = tail;
			for (int j = size - 1; j > index; j--) {
				x = x.prev;
			}
			return x;
		}
	}


}

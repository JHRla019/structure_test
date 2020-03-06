package team.dataStructure;

public class SinglyCircularLinkedList extends Family{
	
	@Override
	public void addFirst(Object input){
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// 새로운 노드의 next 값은 헤드가 지정한 값을 저장하여 다음 노드 값을 가리킨다.
		newNode.next = head;
		// 헤드에 새로운 노드값을 저장하여 새로운 노드를 가리킨다.
		head = newNode;
		size++;
		// tail의 값을 지정하는 구문; 첫 노드 생성 시 head.next값이 없기 때문에 null 판단으로 head의 값을 tail에도 준다. 
		// toString()으로 값 비교시 head와 tail의 값은 같게 나온다.
		if(head.next ==null){
			tail = head;
		}
		tail.next=head;
	}
	@Override
	public void addLast(Object input){
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용합니다.
		if(size==0){
			addFirst(input);
		}else{
			// 마지막 노드의 다음 노드로 생성한 노드를 지정합니다.
			tail.next = newNode;
			// 마지막 노드를 갱신합니다.
			tail = newNode;
			// 순환 : 마지막 노드를 첫 노드로 잡는다
			tail.next = head;
			// 노드 개수 증가 
			size++;		
		}
	}
	
	@Override
	public void add(int k, Object input){
		// 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
		if(k==0){
			addFirst(input);
		} else {
			Node temp1 = node(k-1);
			// k 번째 노드를 temp2로 지정합니다.
			Node temp2 = temp1.next;
			// 새로운 노드를 생성합니다.
			Node newNode = new Node(input);
			// temp1의 다음 노드로 새로운 노드를 지정합니다.
			temp1.next = newNode;
			// 새로운 노드의 다음 노드로 temp2를 지정합니다.
			newNode.next = temp2;
			size++;
			// 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
			if(newNode.next ==head){
				tail = newNode;
				// 순환 : 마지막 노드를 첫 노드로 잡는다				
			}
			tail.next = head;
		}
	}
}

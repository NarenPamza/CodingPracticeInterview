public class LinkedList<E> {

	public Node head;

	class Node {
		E data;

		Node next;

		Node prev;

		Node(E data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	// Add Node at the end
	public void addNode(E data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		tmp.next = newNode;
		newNode.prev = tmp;
	}

	public void removeNode(E data) {

		if (head != null && head.data == data) {
			head = head.next;

			// Reset the prev
			head.prev = null;
			return;
		}

		Node tmp = head;
		while (tmp.next != null) {
			if (tmp.next.data == data) {
				tmp.next = tmp.next.next;

				if (tmp.next != null) {
					tmp.next.prev = tmp;
				}

				break;
			} else {
				tmp = tmp.next;
			}
		}
	}

	public void printNode() {
		Node tmp = head;
		while (tmp.next != null) {
			System.out.println(tmp.data + " Prev Node: " + (tmp.prev != null ? tmp.prev.data : null) + " .Next Node: "
					+ (tmp.next != null ? tmp.next.data : null));
			tmp = tmp.next;
		}
		System.out.println(tmp.data + " Prev Node: " + (tmp.prev != null ? tmp.prev.data : null) + " .Next Node: "
				+ (tmp.next != null ? tmp.next.data : null));
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addNode(3);
		list.addNode(1);
		list.addNode(7);
		list.addNode(5);
		list.addNode(4);

		list.printNode();
		System.out.println("==============");

		list.removeNode(7);

		list.printNode();
	}

}

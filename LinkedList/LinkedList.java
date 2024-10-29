// package MyPackage;

public class LinkedList {

	private class node{

		private int data;

		private node link;

		public node(int data){

			this.data = data;

			this.link = null;
		}
	}

	private node head;

	private node tail;

	public LinkedList(){
		this.head = null;
		this.tail = null;
	}

	public void insert(int data){
		node n = new node(data);
		if(this.head == null)
			this.head = this.tail = n;
		else{
			this.tail.link = n;
			this.tail = n;
		}
	}
	public void insert2(int data){
		node newNode = new node(data);
		if(this.head == null || data < this.head.data){
			newNode.link = this.head;
			this.head = newNode;
			return;
		}
		node current = this.head;
		while(current.link != null && current.link.data < data){
			current = current.link;
		}
		newNode.link = current.link;
		current.link = newNode;
	}

	public void delete(int data){
		if(this.head == null)
			System.out.print("The list is empty!");
		else if(this.head.data == data)
			this.head = this.head.link;
		else{
			node current = this.head;
			while(current != null){
				if(current.link != null && current.link.data == data)
					current.link = current.link.link;
				current = current.link;
			}
		}
	}

	/*public LinkedList(){
		this.head=null;
	}

	public void insert(int data){
		node n=new node(data);
		if(this.head==null)
			this.head=n;
		else{
			node current=this.head;
			while(current.link!=null)
				current=current.link;
			current.link=n;
		}
	}*/

	public void printList(){
		node current = this.head;
		while(current != null){
			System.out.print(current.data + "    ");
			current = current.link;
		}
	}
}

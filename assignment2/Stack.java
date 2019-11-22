package assignment2;

public class Stack {
		public static int index = -1;
		public static int [] items;
		public static void stack(int size) {
			items = new int[size];
		}

		public static void push(int x) {
		if (index == 99) {
		System.out.println("Stack is full...");
		} else {
		items[++index] = x;
		}
		}

		public static int pop() {
		if (index == -1) {
		System.out.println("Underflow stack");
		return '\0';
		} else {
		int element = items[index];
		index--;
		return element;
		}
		}

		public static boolean isEmpty() {
		if (index == -1) {
		return true;
		} else {
		return false;
		}
		}

		public static int size() {
		return index + 1;
		}
		public static int display() {
			int arr = 0;
			for(int i=0;i<=index;i++) {
				arr =items[i];
				System.out.print(arr+" ");
				
			}
			return arr;
			
		}

}



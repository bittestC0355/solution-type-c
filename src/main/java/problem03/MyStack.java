package problem03;

import java.util.Arrays;

public class MyStack {
	private final int RESIZING_COUNT = 1;
	private String[] buffer;
	private int top;
	private int size;

	public MyStack( int size ) {
		this.buffer = new String[size];
		this.top = -1;
		this.size = size;
	}
	
	public void push(String item) {
		if(buffer[size-1] != null) {
			resizing();
		}
		buffer[++top] = item;
	}

	public String pop() {
		if(top==-1) {
			return null;
		}
		return buffer[top--];
	}

	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	public void resizing() {
		String[] temp = new String[this.size+RESIZING_COUNT];
		for(int i=0;i<buffer.length;i++) {
			temp[i] = buffer[i];
		}
		this.buffer = temp;
		this.size++;
	}
}
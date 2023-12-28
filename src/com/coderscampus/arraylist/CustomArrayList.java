package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {

//		System.out.println("Index in add(): " + index);
//		System.out.println("Size in add(): " + index);	
//		System.out.println("Items.length in add() " + items.length);

		if (size < items.length) {
			items[size] = item;
			size++;
		} else if (size == items.length && doesNotContainNull(items)) {
			resizeArray(size);
			items[size] = item;
			size++;
		} else {
			for (int i = 0; i < items.length; i++) {
				if (items[i] == null) {
					items[i] = item;
					size--;
					break;
				}
			}
		}
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = size; i > index; i--) {
				if (size == items.length) {
					items = Arrays.copyOf(items, items.length * 2);
				}
				items[i] = items[i - 1];

			}
			items[index] = item;
			size++;
			return true;
		}
	}

	@Override
	public int getSize() {
		return this.items.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > items.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return (T) items[index];
		}
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			T itemToRemove = (T) items[index];
			items[index] = null;
			for (int i = index; i < size - 1; i++) {
				items[i] = items[i + 1];
			}
			items[size - 1] = null;
			// System.out.println(Arrays.toString(items));
			return itemToRemove;
		}
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", size=" + this.items.length + "]";
	}

	public void resizeArray(int index) {
//		System.out.println("Index: " + index);
//		System.out.println("Items.length: " + items.length);
//		System.out.println("Size: " + size);
		if (index + 1 > items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
	}
	
	public boolean doesNotContainNull(Object[] items) {
		for (Object item : items) {
	        if (item == null) {
	            return false;
	        }
	    }
	    return true;
	}
}
package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		return add(size, item);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		checkForValidIndex(index);
		resizeArray(index);
		
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
		
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return this.items.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		checkForValidIndex(index);
		return (T) items[index];
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) throws IndexOutOfBoundsException {
		checkForValidIndex(index);

		T itemToRemove = (T) items[index];

		items[index] = null;
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size - 1] = null;
		size--;
		return itemToRemove;
	}

	public void resizeArray(int index) {
		if (size == items.length) {
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

	public void checkForValidIndex(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", Current Array Capacity=" + this.items.length
				+ "]";
	}
}
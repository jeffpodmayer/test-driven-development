package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	int index = 0;

	@Override
	public boolean add(T item) {
//		System.out.println("Index in add(): " + index);
//		System.out.println("Size in add(): " + index);	
//		
//		System.out.println("Items.length in add() " + items.length);

		if (index > items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}

		if (index < items.length) {
			items[index] = item;
			size++;
		} else {
			for (int i = 0; i < items.length; i++) {
				if (items[i] == null) {
					items[i] = item;
					index--;
					break;
				}
			}
		}
		index++;
		return true;
	}

//		if (index < items.length) {
//			items[index] = item;
//			size = index + 1;
//			index++;
//		} else {
//			resizeArray(index);
//			items[index] = item;
//			size = index + 1;
//		}
//	
//		return true;

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {

		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (size > items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}

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

		if (index < 0 || index > items.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return (T) items[index];
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}

		T itemToRemove = (T) items[index];

		items[index] = null;

		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size - 1] = null;
		return itemToRemove;

	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", Array Capacity=" + this.items.length + "]";
	}
}

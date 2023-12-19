package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size++] = item;
		return true;
	}

	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Out of Bounds");
		} else {

			for (int i = size; i > index; i--) {
				items[i] = items[i - 1];
			}

			items[index] = item;
			size++;
			items = Arrays.copyOf(items, size);

			System.out.println(Arrays.toString(items));
		}
		return true;
	}

	@Override
	public int getSize() {
		return size;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];

	}

	@SuppressWarnings("unchecked")
	public T remove(int index) throws IndexOutOfBoundsException {
		T itemToRemove = (T) items[index];

		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}

		items = Arrays.copyOf(items, size - 1);

		System.out.println(Arrays.toString(items));
		System.out.println("-----------");
		return itemToRemove;
	}

	@Override
	public String toString() {
		return "Items: " + Arrays.toString(items) + "\nSize: " + size;
	}

}

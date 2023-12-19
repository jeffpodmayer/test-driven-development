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
			throw new ArrayIndexOutOfBoundsException("Index does not exist");
		} else {

			for (int i = size; i > index; i--) {
				if (size == items.length) {
					items = Arrays.copyOf(items, items.length * 2);
					
				}
				items[i] = items[i - 1];
			}
			size++;

			items[index] = item;
			items = Arrays.copyOf(items, size);

			
		}
		System.out.println(Arrays.toString(items));
		return true;
	}

	@Override
	public int getSize() {
		return size;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return (T) items[index];

	}

	@SuppressWarnings("unchecked")
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("That index does not exist within the Array");
		} else {
			T itemToRemove = (T) items[index];

			for (int i = index; i < size - 1; i++) {
				items[i] = items[i + 1];
			}

			size--;

			items = Arrays.copyOf(items, size);

			System.out.println(Arrays.toString(items));
			return itemToRemove;
		}
	}

}

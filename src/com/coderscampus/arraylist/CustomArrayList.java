package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {     //this needs to be fixed......I NEED HELP.
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		} else if (size < items.length) {
			items[size++] = item;
		} else if (size == items.length) {
			int index = 0;
			while (items[index] != null) {
				index++;
				if (items[index] == null) {
					items[index] = item;
				}
			}
		}
		return true;
	}

	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		try {
			if (index < 0 || index > size) {
				throw new ArrayIndexOutOfBoundsException("AddMethod: Index does not exist");
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
				return true;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("That index you want to ADD to does not exist in the list!");
			return false;
		}

	}

	@Override
	public int getSize() {
		return size;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		try {
			if (index < 0 || index > size) {
				throw new ArrayIndexOutOfBoundsException("GetMethod: Index does not exist");
			} else {
				return (T) items[index];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you want to GET does not exist in the list!");
			return (T) "";
		}
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) throws IndexOutOfBoundsException {
		try {
			if (index < 0 || index >= size) {
				throw new ArrayIndexOutOfBoundsException("RemoveMethod: Index does not exist");
			} else {
				T itemToRemove = (T) items[index];

				items[index] = null;

				for (int i = index; i < size - 1; i++) {
					items[i] = items[i + 1];
				}

				items = Arrays.copyOf(items, size);
	//			System.out.println(Arrays.toString(items));

				return itemToRemove;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you want to REMOVE does not exist in the list!");
			return (T) "";
		}
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", size=" + size + "]";
	}

}

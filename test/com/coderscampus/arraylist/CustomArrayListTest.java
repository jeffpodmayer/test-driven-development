package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	public void should_add_one_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		sut.add(1);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();

		assertEquals(1, expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	public void should_add_100_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 100; i++) {
			sut.add(i + 1);
		}

		for (int i = 0; i < 100; i++) {
			assertEquals(i + 1, sut.get(i));
		}

		assertEquals(100, sut.getSize());

	}

	@Test
	public void should_add_item_to_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i <= 10; i++) {
			sut.add(i);
		}
		sut.add(4, 5);
		sut.add(5, 5);
		sut.add(6, 5);
		sut.add(7, 5);
		sut.add(8, 5);
		sut.add(9, 5);
		sut.add(10, 5);
		assertEquals(18, sut.getSize());
	}

	@Test
	public void should_remove_item_at_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.remove(8);
		assertEquals(9, sut.getSize());
	}
}

// Test for removing an item at the end of the list 
// Test for removing item at the beginning

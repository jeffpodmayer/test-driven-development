package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CustomArrayListTest {

	// Tests adding one item and resizing array
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
	public void should_resize_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 100; i++) {
			sut.add(i + 1);
		}

		for (int i = 0; i < 100; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(100, sut.getSize());
	}

	// Tests adding items at various parts of array
	@Test
	public void should_add_item_to_beginning_of_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i <= 10; i++) {
			sut.add(i);
		}
		sut.add(0, 5);

		assertEquals(5, sut.get(0));

	}

	@Test
	public void should_add_item_to_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i <= 10; i++) {
			sut.add(i);
		}
		sut.add(4, 5);

		assertEquals(12, sut.getSize());
		assertEquals(5, sut.get(4));
	}

	@Test
	public void should_add_element_to_end_of_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i <= 10; i++) {
			sut.add(i);
		}

		sut.add(10, 1);

		assertEquals(1, sut.get(10));
		assertEquals(12, sut.getSize());
	}

	@Test
	public void should_throw_exception_when_index_does_not_exist() throws Exception {
		
        assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
        	
        	@Override
        	public void execute() {
        		CustomList<Integer> sut = new CustomArrayList<>();
        		for (int i = 0; i <= 10; i++) {
        			sut.add(i);
        		}
        		sut.add(12,3);
        	} 
        });
	}

	// Test the getSize method
	@Test
	public void should_get_size_of_empty_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		sut.getSize();

		assertEquals(0, sut.getSize());
	}

	@Test
	public void should_get_size_of_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		Integer size = sut.getSize();

		assertEquals(10, size);
	}

	// Test the get method
	@Test
	public void should_get_item_at_specfied_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}

		sut.get(0);

		assertEquals(0, sut.get(0));
	}

	@Test
	public void should_get_item_after_removing_and_adding() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}

		sut.remove(0);
		sut.add(0, 5);
		sut.get(0);

		assertEquals(5, sut.get(0));
	}

	@Test
	public void should_throw_exception_when_get_index_does_not_exist() throws Exception {
        CustomList<Integer> sut = new CustomArrayList<>();
        sut.get(1);
        
        assertEquals("The index you want to get does not exist in the list!", sut.get(1));  	   
	}

	// Test the remove method
	@Test
	public void should_remove_item_from_beginning_of_list_and_update_size() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.remove(0);
		assertEquals(9, sut.getSize());
		assertEquals(1, sut.get(0));
	}

	@Test
	public void should_remove_item_at_the_end_of_the_list_and_update_size() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.remove(9);
		assertEquals(9, sut.getSize());
		assertEquals(8, sut.get(8));

	}
	
	@Test
	public void should_remove_item_at_specified_index_and_update_size() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		sut.remove(8);
		assertEquals(9, sut.getSize());
	}

	@Test
	public void should_throw_exception_when_remove_index_does_not_exist() throws Exception{
		 CustomList<Integer> sut = new CustomArrayList<>();
		 
		 for (int i = 0; i < 10; i++) {
				sut.add(i);
			}
		 
	     sut.remove(12);
	        
	     assertEquals("The index you want to remove does not exist in the list!", sut.remove(12));
	}
}


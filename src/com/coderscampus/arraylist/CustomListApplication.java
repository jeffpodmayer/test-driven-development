package com.coderscampus.arraylist;


public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		System.out.println(sut);
		sut.remove(9); // 0, 1, 2,3, 4, 5, 6, 7, 8, null
		System.out.println(sut);
		sut.remove(7); // 0, 1, 2, 3, 4, 5, 6, 8, null, null
		System.out.println(sut);
		sut.add(1000);  // 0, 1, 2, 3, 4, 5, 6, 8, 1000, null
		System.out.println(sut);
		sut.add(7, 1001); // 0, 1, 2, 3, 4, 5, 6, 1001, 8, 1000
		System.out.println(sut);
		sut.add(7, 1002); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		System.out.println(sut);
		sut.add(7, 89); // 0, 1, 2, 3, 4, 5, 6, 89, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		System.out.println(sut);
		sut.remove(7); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		System.out.println(sut);
		sut.add(2000); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, 2000, null, ... (up to index 19)
		System.out.println(sut);
		sut.add(3000); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, 2000, 3000, null, ... (up to index 19)
		System.out.println(sut);
		
		}
	}



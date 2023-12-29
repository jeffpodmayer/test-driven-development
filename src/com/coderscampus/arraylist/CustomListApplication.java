package com.coderscampus.arraylist;


public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			sut.add(i);
		}
		
		System.out.println(sut);	
		
		sut.remove(15);
		System.out.println(sut);
		sut.add(2000); 
		System.out.println(sut);
		sut.remove(9); 
		System.out.println(sut); // 0, 1, 2,3, 4, 5, 6, 7, 8, null
		sut.add(7, 1001); 
		System.out.println(sut); // 0, 1, 2, 3, 4, 5, 6, 1001, 8, 1000
		sut.remove(7); 
		System.out.println(sut); // 0, 1, 2, 3, 4, 5, 6, 8, null, null
		sut.remove(7); 
		System.out.println(sut); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		sut.add(2000); 
		System.out.println(sut); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, 2000, null, ... (up to index 19)
		sut.add(1000);  
		System.out.println(sut); // 0, 1, 2, 3, 4, 5, 6, 8, 1000, null
		sut.add(7, 1002);
		System.out.println(sut);  // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		sut.add(7, 89);
		System.out.println(sut);  // 0, 1, 2, 3, 4, 5, 6, 89, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
		sut.add(3000);
		System.out.println(sut);
//		sut.add(0,3001);
//		System.out.println(sut);
		
		
		}
	}



package com.coderscampus.arraylist;


public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			sut.add(i);
		}
		
		System.out.println(sut);		
//		sut.remove(9); // 0, 1, 2,3, 4, 5, 6, 7, 8, null
//		System.out.println(sut);
//		sut.remove(7); // 0, 1, 2, 3, 4, 5, 6, 8, null, null
//		System.out.println(sut);
//		sut.add(1000);  // 0, 1, 2, 3, 4, 5, 6, 8, 1000, null
//		System.out.println(sut);
//		sut.add(7, 1001); // 0, 1, 2, 3, 4, 5, 6, 1001, 8, 1000
//		System.out.println(sut);
//		sut.add(7, 1002); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
//		System.out.println(sut);
//		sut.add(7, 89); // 0, 1, 2, 3, 4, 5, 6, 89, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
//		System.out.println(sut);
//		sut.remove(7); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, null, null, ... (up to index 19)
//		System.out.println(sut);
//		sut.add(2000); // 0, 1, 2, 3, 4, 5, 6, 1002, 1001, 8, 1000, 2000, null, ... (up to index 19)
//		System.out.println(sut);

		
		}
		
		
//
//		trailsList.add("Pacific Crest Trail");
//		trailsList.add("Appalachian Trail");
//		trailsList.add("Continential Divide Trail");
//		trailsList.add("Pacific Northwest Trail");
//		trailsList.add("Sierra High Route");
//		trailsList.add("Low 2 High Route");
//		trailsList.add("Desert Winter Thru Hike");
//		trailsList.add("Mongollon Rim Trail");
//		trailsList.add("Cougar Traverse");
//		trailsList.add("Ozark Highlands Trail");
//		trailsList.add("Northern New Mexico Loop");
//
//		System.out.println("Added to Index 3: " + trailsList.add(3, "Arizona Trail"));
//		System.out.println("-----------");
//
//		System.out.println("Get Item at 55: ");
//		trailsList.get(55);
//		System.out.println("-----------");
//
//		System.out.println("Removed Item at 55: ");
//		trailsList.remove(55);
//		System.out.println("-----------");
//
//		System.out.println("Added Item at 55: ");
//		trailsList.add(55, "Not Added");
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 5: " + trailsList.add(5, "Pfiffner Traverse"));
//		System.out.println("-----------");
//
//		System.out.println("Array Size: " + trailsList.getSize());
//		System.out.println("-----------");
//
//		System.out.println("Get Item at 5: " + trailsList.get(5));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 6: " + trailsList.add(6, "Bear Tooth High Route"));
//		System.out.println("-----------");
//
//		System.out.println("Array Size: " + trailsList.getSize());
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 13 (the last Index): " + trailsList.add(13, "North Cascades High Route"));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 0: " + trailsList.add(0, "Via Alpina"));
//		System.out.println("-----------");
//
//		System.out.println("Removed Item at 13: " + trailsList.remove(13));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 5: " + trailsList.add(5, "Camino De Santiago"));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 7: " + trailsList.add(7, "Te Araroa"));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 9: " + trailsList.add(9, "Annapurna Circuit"));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 11: " + trailsList.add(11, "West Highland Way"));
//		System.out.println("-----------");
//
//		System.out.println("Removed Item at 15: " + trailsList.remove(15));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 15: " + trailsList.add(15, "Anza Borrego Trail"));
//		System.out.println("-----------");
//
//		System.out.println("Added to Index 11: " + trailsList.add(11, "Iceland Traverse"));
//		System.out.println("-----------");
//
//		System.out.println("Array Size: " + trailsList.getSize());
//		System.out.println("-----------");
//
//		System.out.println("Added Item: " + trailsList.add("Sky Islands Traverse") );
//		System.out.println("-----------");
//		
//		System.out.println("Added Item: " + trailsList.add("Wonderland Trail"));
//		System.out.println("-----------");
//		
//		System.out.println("Get Indexed Item: " + trailsList.get(17));
//		System.out.println("-----------");
//		
//		System.out.println("Array Size: " + trailsList.getSize());
//		System.out.println("-----------");
//
//		for (int i = 0; i < trailsList.getSize(); i++) {
//			System.out.println("Index " + i + ": " + trailsList.get(i));
		//}

	}



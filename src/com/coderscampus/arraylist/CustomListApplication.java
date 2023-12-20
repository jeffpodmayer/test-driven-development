package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> trailsList = new CustomArrayList<>();

		trailsList.add("Pacific Crest Trail");
		trailsList.add("Appalachian Trail");
		trailsList.add("Continential Divide Trail");
		trailsList.add("Pacific Northwest Trail");
		trailsList.add("Sierra High Route");
		trailsList.add("Low 2 High Route");
		trailsList.add("Desert Winter Thru Hike");
		trailsList.add("Mongollon Rim Trail");
		trailsList.add("Cougar Traverse");
		trailsList.add("Ozark Highlands Trail");
		trailsList.add("Northern New Mexico Loop");

		System.out.println("Added to Index 3: ");
		System.out.println(trailsList.add(3, "Arizona Trail"));
		System.out.println("-----------");

		System.out.println("Get Item at 55: ");
		System.out.println(trailsList.get(55));
		System.out.println("-----------");

		System.out.println("Removed Item at 55: ");
		System.out.println(trailsList.remove(55));
		System.out.println("-----------");

		System.out.println("Added to Index 5: ");
		System.out.println(trailsList.add(5, "Pfiffner Traverse"));
		System.out.println("-----------");

		System.out.println("Array Size: ");
		System.out.println(trailsList.getSize());
		System.out.println("-----------");

		System.out.println("Get Item at 5: ");
		System.out.println(trailsList.get(5));
		System.out.println("-----------");

		System.out.println("Added to Index 6: ");
		System.out.println(trailsList.add(6, "Bear Tooth High Route"));
		System.out.println("-----------");
		
		System.out.println("Array Size: ");
		System.out.println(trailsList.getSize());
		System.out.println("-----------");

		System.out.println("Added to Index 12 (the last Index): ");
		System.out.println(trailsList.add(12, "North Cascades High Route"));
		System.out.println("-----------");

		System.out.println("Added to Index 0: ");
		System.out.println(trailsList.add(0, "Via Alpina"));
		System.out.println("-----------");

		System.out.println("Removed Item at 13: ");
		System.out.println(trailsList.remove(13));
		System.out.println("-----------");

		System.out.println("Added to Index 5: ");
		System.out.println(trailsList.add(5, "Camino De Santiago"));
		System.out.println("-----------");

		System.out.println("Added to Index 7: ");
		System.out.println(trailsList.add(7, "Te Araroa"));
		System.out.println("-----------");

		System.out.println("Added to Index 9: ");
		System.out.println(trailsList.add(9, "Annapurna Circuit"));
		System.out.println("-----------");

		System.out.println("Added to Index 11: ");
		System.out.println(trailsList.add(11, "West Highland Way"));
		System.out.println("-----------");

		System.out.println("Removed Item at 15: ");
		System.out.println(trailsList.remove(15));
		System.out.println("-----------");

		System.out.println("Added to Index 15: ");
		System.out.println(trailsList.add(15, "Anza Borrego Trail"));
		System.out.println("-----------");
		
		System.out.println("Added to Index 11: ");
		System.out.println(trailsList.add(11,"Iceland Traverse"));
		System.out.println("-----------");

		System.out.println("Array Size: ");
		System.out.println(trailsList.getSize());
		System.out.println("-----------");
		
		trailsList.add("Sky Islands Traverse");
		trailsList.add("Wonderland Trail");


		System.out.println("Get Indexed Item: ");
		System.out.println(trailsList.get(17));
		System.out.println("-----------");

		for (int i = 0; i < trailsList.getSize(); i++) {
			System.out.println("Index " + i + ": " + trailsList.get(i));
		}

//		System.out.println("Added to Index 55: ");
//		System.out.println(trailsList.add(55, "Ouchita Trail"));
//		System.out.println("-----------");
	}

}

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
			trailsList.add("Arizona Trail");
			trailsList.add("Pfiffner Traverse");
			trailsList.add("Bear Tooth High Route");
			trailsList.add("North Cascades High Route");
			trailsList.add("Via Alpina");
			trailsList.add("Camino De Santiago");
			trailsList.add("Te Araroa");
			trailsList.add("Annapurna Circuit");
			trailsList.add("West Highland Way");
			trailsList.add("Anza Borrego Trail");
			trailsList.add("Iceland Traverse");

			for (int i = 0; i < trailsList.getSize(); i++) {
				System.out.println(trailsList.get(i));
			}	
			
			System.out.println("Added to Index 3: ");
			System.out.println(trailsList.add(3,"Bulgers List"));
			System.out.println("-----------");
			
			System.out.println("Get Item: ");
			System.out.println(trailsList.get(3));
			System.out.println("-----------");
			
			System.out.println("Removed Item: ");
			System.out.println(trailsList.remove(9));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Added to Index 5: ");
			System.out.println(trailsList.add(5,"Eagles 33"));
			System.out.println("-----------");
			
			System.out.println("Get Item: ");
			System.out.println(trailsList.get(5));
			System.out.println("-----------");
			
			System.out.println("Array Size: ");
			System.out.println(trailsList.getSize());
			System.out.println("-----------");			
			
			System.out.println("Removed Item: ");
			System.out.println(trailsList.remove(13));
			System.out.println("-----------");
			
			System.out.println("Array Size: ");
			System.out.println(trailsList.getSize());
			System.out.println("-----------");
			
			System.out.println("Removed Item: ");
			System.out.println(trailsList.remove(15));
			System.out.println("-----------");
				
			System.out.println("Array Size: ");
			System.out.println(trailsList.getSize());
			System.out.println("-----------");

			System.out.println("Get Indexed Item: ");
			System.out.println(trailsList.get(17));
			System.out.println("-----------");
			
			System.out.println("Added to Index 18: ");
			System.out.println(trailsList.add(18,"Ouchita Trail"));
			System.out.println("-----------");		
			
			System.out.println(trailsList);
			
			
		}

}

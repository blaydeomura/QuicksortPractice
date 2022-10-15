import java.util.ArrayList;

public class Driver {

		ArrayList<Actor> actorList;
		int length;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ArrayList<Actor> actorList = new ArrayList<Actor>();
			Actor ac1 = new Actor("Sam Worthington");
			actorList.add(ac1);
			
			Actor ac2 = new Actor("Jennifer Lawrence");
			actorList.add(ac2);
			
			Actor ac3 = new Actor("Adam Sandler");
			actorList.add(ac3);
			
			Actor ac4 = new Actor("Chris Rock");
			actorList.add(ac4);
			
			Actor ac5 = new Actor("Will Smith");
			actorList.add(ac5);
			
			Actor ac6 = new Actor("Hello Kitty");
			actorList.add(ac6);
			
			Actor ac7 = new Actor("An Tran");
			actorList.add(ac7);
			
			Actor ac8 = new Actor("Blayde Omura");
			actorList.add(ac8);
			
			System.out.println(actorList);
			
			Driver sorter = new Driver();
			sorter.sort(actorList);
			
			System.out.println(actorList);	
		
		}
		
		public void swap(int i, int j) {
			Actor temp = actorList.get(i);
			actorList.set(i, actorList.get(j));
			actorList.set(j, temp);
		}
		
		public void sort(ArrayList<Actor> actorList) {
			if (actorList.size() == 0) {
				return;
			}
			actorList = actorList;
			length = actorList.size();
			quickSort(0, length-1);
		}
		
		public void quickSort(int low, int high) {
			
			int i = low;
			int j = high;
			Actor pivot = actorList.get(low + (high - low) /2);
			
			while ( i <= j) {
				while (actorList.get(i).compareToIgnoreCase(pivot) > 0) {
					i++;
				}
				
				while (actorList.get(j).compareToIgnoreCase(pivot) > 0) {
					j--;
				}
				
				if (i <= j); {
					swap(i, j);
					i++;
					j--;
				}
					
			}
			if (low < j) {
				quickSort(low, j);
			}
			if (i < high) {
				quickSort(i, high);
			}
		}
	
		
		
	}



/*
 * Douglas Wendel
 * CSCE 146
 * Homework06
 */
public class sheepTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sheep SEheep = new sheep();

		sheepHeap heap = new sheepHeap(100000);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\nWelcome to the sheep heap program!\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println();
		
		//add sheep
		System.out.println("Adding 15 sheep to the herd");
		System.out.println();
		heap.addSheep(new sheep("Douglas", 15));
		heap.addSheep(new sheep("Will", 245));
		heap.addSheep(new sheep("Alex",98));
		heap.addSheep(new sheep("Jackson",72));
		heap.addSheep(new sheep("Darious",235));
		heap.addSheep(new sheep("Charlie",53));
		heap.addSheep(new sheep("Sam",53));
		heap.addSheep(new sheep("Adam",63));
		heap.addSheep(new sheep("Jim",76));
		heap.addSheep(new sheep("James",35));
		heap.addSheep(new sheep("Joe",200));
		heap.addSheep(new sheep("Dean",45));
		heap.addSheep(new sheep("Tyler",98));
		heap.addSheep(new sheep("Skippy",25));
		heap.addSheep(new sheep("Clyde",12));


		//remove sheep
		System.out.println("Removing 5 sheep from the herd");
		System.out.println();
		heap.removeSheep();
		heap.removeSheep();
		heap.removeSheep();
		heap.removeSheep();
		heap.removeSheep();

		//printing sheep information
		System.out.println("Printing the call sheep roll call");
		heap.sheepRollCall();
		System.out.println();
		
		
		
		System.out.println("Printing the sheep herd sort!");
		heap.sheepHeapSort();
		
		//add 15 sheep
		//remove 5 sheep
		//call sheep roll call
		//show sheep herd sort works

	}

}

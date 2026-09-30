public class LokerSystem {
	public static void main(String[] args) {
		int locker1 = 101; 
		int locker2 = 202; 

		System.out.println("Before swap:");
		System.out.println("Locker 1 contains Parcel ID = " + locker1);
		System.out.println("Locker 2 contains Parcel ID = " + locker2);

		int temp = locker1;
		locker1 = locker2;
		locker2 = temp;

		System.out.println("After swap:");
		System.out.println("Locker 1 contains Parcel ID = " + locker1);
		System.out.println("Locker 2 contains Parcel ID = " + locker2);

        System.out.print("Thank you for using the Smart Locker System!");
	}
}

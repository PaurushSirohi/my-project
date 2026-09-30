import java.util.Random;

import java.util.Scanner;

public class SmartLockerSystem {

static boolean lockerOccupied = false;

static String studentName = "";

static String parcelId = "";

static String parcelSize = "";

static int otp = 0;

 

public static void main(String[] args) {

 

   Scanner sc = new Scanner(System.in);

   int choice;

 

   do {

       System.out.println("\n========== SMART LOCKER SYSTEM ==========");

       System.out.println("1. Store Parcel");

       System.out.println("2. Retrieve Parcel");

       System.out.println("3. View Locker Status");

       System.out.println("4. Exit");

       System.out.print("Enter your choice: ");

       choice = sc.nextInt();

       sc.nextLine();

 

       switch (choice) {

 

           case 1:

               if (lockerOccupied) {

                   System.out.println("Locker is already occupied.");

               } else {

                   storeParcel(sc);

               }

               break;

 

           case 2:

               retrieveParcel(sc);

               break;

 

           case 3:

               displayStatus();

               break;

 

           case 4:

               System.out.println("Thank you for using Smart Locker System.");

               break;

 

           default:

               System.out.println("Invalid Choice.");

       }

 

   } while (choice != 4);

 

   sc.close();

}

 

// Store Parcel

static void storeParcel(Scanner sc) {

 

   System.out.print("Enter Student Name: ");

   studentName = sc.nextLine();

 

   System.out.print("Enter Parcel ID: ");

   parcelId = sc.nextLine();

 

   System.out.print("Enter Parcel Size (Small/Medium/Large): ");

   parcelSize = sc.nextLine();

 

   Random random = new Random();

   otp = 1000 + random.nextInt(9000);

 

   lockerOccupied = true;

 

   System.out.println("\nParcel Stored Successfully.");

   System.out.println("Generated OTP: " + otp);

   System.out.println("Use this OTP to collect your parcel.");

}

 

// Retrieve Parcel

static void retrieveParcel(Scanner sc) {

 

   if (!lockerOccupied) {

       System.out.println("Locker is Empty.");

       return;

   }

 

   System.out.print("Enter OTP: ");

   int enteredOtp = sc.nextInt();

 

   if (enteredOtp == otp) {

 

       System.out.println("\nOTP Verified.");

       System.out.println("Locker Opened Successfully.");

       System.out.println("Parcel Collected by " + studentName);

 

       lockerOccupied = false;

       studentName = "";

       parcelId = "";

       parcelSize = "";

       otp = 0;

 

   } else {

       System.out.println("Incorrect OTP. Access Denied.");

   }

}

 

// Display Locker Status

static void displayStatus() {

 

   System.out.println("\n========== LOCKER STATUS ==========");

 

   if (lockerOccupied) {

       System.out.println("Status      : Occupied");

       System.out.println("Student     : " + studentName);

       System.out.println("Parcel ID   : " + parcelId);

       System.out.println("Parcel Size : " + parcelSize);

   } else {

       System.out.println("Status : Available");

   }

}

}
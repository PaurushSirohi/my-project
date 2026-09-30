import java.util.Scanner;

class SmartLockerS {
    String name;
    int parcelId;
    int rollNo;
    int OTP;

    SmartLockerS(String name, int parcelId, int rollNo, int OTP) {
        this.name = name;
        this.parcelId = parcelId;
        this.rollNo = rollNo;
        this.OTP = OTP;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("parcelId:" + parcelId);
        System.out.println("rollNo:" + rollNo);
        System.out.println("OTP:" + OTP);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Parcel ID: ");
        int parcelId = sc.nextInt();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter OTP: ");
        int OTP = sc.nextInt();

        SmartLockerS s = new SmartLockerS(name, parcelId, rollNo, OTP);
        s.display();
        sc.close();
    }
}
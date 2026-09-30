import java.util.Scanner;

public class CourierRouteTracking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parcel ID: ");
        String parcelId = sc.nextLine();

        System.out.print("Does the parcel need a signature? (yes/no): ");
        String signatureInput = sc.nextLine();

        boolean needsSignature = signatureInput.equalsIgnoreCase("yes");
        boolean customerSigned = false;

        String parcelStatus = "REGISTERED";

        String[] route = {
            "Sorting Hub A",
            "Regional Facility B",
            "Local Dispatch Center",
            "Customer Address"
        };

        System.out.println("\nParcel: " + parcelId);
        System.out.println("Delivery Route:");

        for (int i = 0; i < route.length; i++) {
            System.out.println("Stop " + (i + 1) + ": " + route[i]);
        }

        System.out.println("\n=== TRANSIT & STATUS UPDATES ===");

        int locationIndex = 0;

        while (!parcelStatus.equals("DELIVERED")
                && !parcelStatus.equals("FAILED")) {

            System.out.println("\nCurrent Location: " + route[locationIndex]);

            switch (parcelStatus) {

                case "REGISTERED":
                    System.out.println(
                        "Parcel has been registered successfully."
                    );

                    parcelStatus = "IN_TRANSIT";
                    break;

                case "IN_TRANSIT":
                    System.out.println(
                        "Parcel is travelling to the next facility."
                    );

                    if (locationIndex < route.length - 1) {
                        locationIndex++;
                    }

                    if (locationIndex == route.length - 1) {
                        parcelStatus = "OUT_FOR_DELIVERY";
                    }

                    break;

                case "OUT_FOR_DELIVERY":
                    System.out.println(
                        "Driver is delivering the parcel."
                    );

                    if (needsSignature) {

                        System.out.print(
                            "Has the customer signed? (yes/no): "
                        );

                        String signedInput = sc.nextLine();

                        if (signedInput.equalsIgnoreCase("yes")) {
                            customerSigned = true;
                            System.out.println("Signature received.");
                            parcelStatus = "DELIVERED";
                        } else {
                            System.out.println(
                                "Signature not received."
                            );
                            parcelStatus = "FAILED";
                        }

                    } else {

                        System.out.println(
                            "No signature is required."
                        );

                        parcelStatus = "DELIVERED";
                    }

                    break;

                default:
                    System.out.println(
                        "Invalid parcel status detected."
                    );

                    parcelStatus = "FAILED";
                    break;
            }
        }

        System.out.println("\n=== DELIVERY CONFIRMATION ===");

        if (parcelStatus.equals("DELIVERED")) {

            if (needsSignature && !customerSigned) {

                System.out.println(
                    "Delivery cannot be confirmed because "
                    + "the signature is missing."
                );

            } else {

                System.out.println(
                    "SUCCESS: Parcel " + parcelId
                    + " has been delivered successfully!"
                );
            }

        } else {

            System.out.println(
                "ALERT: Parcel delivery failed. Status: "
                + parcelStatus
            );
        }

        sc.close();
    }
}



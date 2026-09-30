public class FirstStarRating {
    public static void main(String[] args) {
        int numPeople = 50;
        int[] people = new int[numPeople];

        for (int i = 0; i < people.length; i++) {
            people[i] = i + 1;
        }     
        System.out.println("From 1 to " + numPeople + " people, " + people.length + " got 1 star on CodeChef.");
    }
}

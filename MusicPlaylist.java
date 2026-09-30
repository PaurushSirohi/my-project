import java.util.Scanner;

public class MusicPlaylist { 
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of songs in the playlist: ");
        int numSongs = scanner.nextInt();
        scanner.nextLine(); 

        String[] playlist = new String[numSongs];

        for (int i = 0; i < numSongs; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            playlist[i] = scanner.nextLine();
        }

        System.out.println("\n--- Music Playlist ---");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " + playlist[i]);
        }
    }
}


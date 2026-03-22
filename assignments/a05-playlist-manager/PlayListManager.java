import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class PlayListManager {

    private MyDoubleLinkedList<Song> playlist;
    private Scanner scanner;
    private Random random;

    /**
     * Creates a new playlist manager.
     */
    public PlayListManager() {
        playlist = new MyDoubleLinkedList<>();
        scanner = new Scanner(System.in);
        random = new Random();
    }

    /**
     * Prompts for a command.
     * @return the command entered
     */
    private String promptCommand() {
        System.out.print("\n: ");
        String command = scanner.nextLine().trim().toLowerCase();
        return command;
    }

    /**
     * Adds a song to the playlist.
     */
    private void addSong() {
        System.out.print("Enter artist: ");
        String artist = scanner.nextLine().trim();

        if (artist.isEmpty()) {
            System.out.println("Error: Artist cannot be empty.");
            return;
        }

        System.out.print("Enter title: ");
        String title = scanner.nextLine().trim();

        if (title.isEmpty()) {
            System.out.println("Error: Title cannot be empty.");
            return;
        }

        Song song = new Song(title, artist);
        playlist.add(song);
    }

    /**
     * Removes a song from the playlist.
     */
    private void removeSong() {
        if (playlist.isEmpty()) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        System.out.print("Enter artist: ");
        String artist = scanner.nextLine().trim();

        if (artist.isEmpty()) {
            System.out.println("Error: Artist cannot be empty.");
            return;
        }

        System.out.print("Enter title: ");
        String title = scanner.nextLine().trim();

        if (title.isEmpty()) {
            System.out.println("Error: Title cannot be empty.");
            return;
        }

        Song targetSong = new Song(title, artist);
        boolean removed = playlist.remove(targetSong);

        if (!removed) {
            System.out.println("Error: Song not found in playlist.");
        }
    }

    /**
     * Shows the count of songs.
     */
    private void showCount() {
        System.out.println(playlist.count());
    }

    /**
     * Plays the playlist.
     */
    private void playPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        for (int i = 0; i < playlist.size(); i++) {
            Song song = playlist.get(i);
            System.out.println(song.getArtist() + " - " + song.getTitle());
        }
    }

    /**
     * Shuffles the playlist randomly.
     */
    private void shufflePlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        if (playlist.size() == 1) {
            System.out.println("Error: Need at least 2 songs to shuffle.");
            return;
        }

        // Fisher-Yates shuffle
        for (int i = playlist.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Song temp = playlist.get(i);
            playlist.set(i, playlist.get(j));
            playlist.set(j, temp);
        }
    }

    /**
     * Reverses the playlist order.
     */
    private void reversePlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        if (playlist.size() == 1) {
            System.out.println("Error: Need at least 2 songs to reverse.");
            return;
        }

        playlist.reverse();
    }

    /**
     * Saves the playlist to a file.
     */
    private void savePlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        System.out.print("Enter file: ");
        String filename = scanner.nextLine().trim();

        if (filename.isEmpty()) {
            System.out.println("Error: Filename cannot be empty.");
            return;
        }

        try {
            BufferedWriter writer = new BufferedWriter(
                new FileWriter(filename)
            );

            for (int i = 0; i < playlist.size(); i++) {
                Song song = playlist.get(i);
                writer.write(song.getTitle());
                writer.newLine();
                writer.write(song.getArtist());
                writer.newLine();
            }

            writer.close();
            System.out.println("Playlist saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error: Could not save file.");
        }
    }

    /**
     * Loads a playlist from a file.
     */
    private void loadPlaylist() {
        System.out.print("Enter file: ");
        String filename = scanner.nextLine().trim();

        if (filename.isEmpty()) {
            System.out.println("Error: Filename cannot be empty.");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(filename)
            );

            MyDoubleLinkedList<Song> newPlaylist = new MyDoubleLinkedList<>();
            String title;

            while ((title = reader.readLine()) != null) {
                String artist = reader.readLine();

                if (artist == null) {
                    System.out.println("Error: File format is invalid.");
                    reader.close();
                    return;
                }

                Song song = new Song(title, artist);
                newPlaylist.add(song);
            }

            reader.close();

            if (newPlaylist.size() > 0) {
                playlist = newPlaylist;
                System.out.println(
                    "Loaded " + newPlaylist.size() + " song(s) from " + filename
                );
            } else {
                System.out.println("Error: File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error: File not found or could not be read.");
        }
    }

    public void run() {
        System.out.println("*** Playlist Manager ***");
        System.out.println("Commands:");
        System.out.println("add");
        System.out.println("remove");
        System.out.println("count");
        System.out.println("play");
        System.out.println("shuffle");
        System.out.println("reverse");
        System.out.println("quit");

        boolean running = true;

        while (running) {
            String command = promptCommand();

            if (command.equals("add")) {
                addSong();
            } else if (command.equals("remove")) {
                removeSong();
            } else if (command.equals("count")) {
                showCount();
            } else if (command.equals("play")) {
                playPlaylist();
            } else if (command.equals("shuffle")) {
                shufflePlaylist();
            } else if (command.equals("reverse")) {
                reversePlaylist();
            } else if (command.equals("save")) {
                savePlaylist();
            } else if (command.equals("load")) {
                loadPlaylist();
            } else if (command.equals("quit")) {
                running = false;
            } else if (!command.isEmpty()) {
                System.out.println("Error: Invalid command.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        PlayListManager manager = new PlayListManager();
        manager.run();
    }
}

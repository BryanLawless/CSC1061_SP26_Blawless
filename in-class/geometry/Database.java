import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Database {

    private File outFile = new File("database.csv");
    PrintWriter printer;
    Scanner reader;

    public Database() {
        try {
            if (!outFile.exists()) {
                outFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(
                "could not create database file: " + e.getMessage()
            );
            System.exit(1);
        }

        try {
            printer = new PrintWriter(outFile.getName());
            reader = new Scanner(outFile);
        } catch (FileNotFoundException e) {
            System.out.println(
                "database could not be initialized: " + e.getMessage()
            );
            System.exit(1);
        }
    }

    public void write(GeometricObject shape) {
        printer.print(shape.getClass().getName());
        printer.print("," + shape.getColor());
        printer.print("," + shape.isFilled());
        printer.print("," + shape.getDateCreated());
        printer.println();

        printer.flush();
    }

    public GeometricObject read() {
        String line;
        if (reader.hasNextLine()) {
            line = reader.nextLine();
        } else {
            return null;
        }

        String[] tokens = line.split(",");

        GeometricObject geoObject = null;
        if (tokens[0].equals("Rectangle")) {
            // geoObject = new Rectangle(
            //     tokens[1].trim(),
            //     Boolean.parseBoolean(tokens[2]),
            //     Double.parseDouble(tokens[3]),
            //     DateFormat.parse(tokens[4])
            // );
        }

        return geoObject;
    }

    public void disconnect() {
        printer.close();
        reader.close();
    }
}

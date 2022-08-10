package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readInput()  {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
            return result;
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file", ioe);
        }
    }
}

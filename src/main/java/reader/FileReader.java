package reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    public List<String> read(String filePath) throws IOException {

        return Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);
    }
}
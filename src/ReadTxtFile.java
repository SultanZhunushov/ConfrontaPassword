import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class ReadTxtFile {
    public List<String> readFileInList(String nomeFile) {
        List<String> righe = Collections.emptyList();
        try {
            righe = Files.readAllLines(Path.of(nomeFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return righe;
    }
}
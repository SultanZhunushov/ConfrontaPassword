import java.util.List;

public class ConfrontaPassword extends ReadTxtFile {

    @Override
    public List<String> readFileInList(String nomeFile) {
        return super.readFileInList(nomeFile);
    }

    public boolean confronta(String PATH, String password) {
        for (String s: readFileInList(PATH)) {
            if (password.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
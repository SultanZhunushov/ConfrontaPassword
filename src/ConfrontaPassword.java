import java.util.List;

public class ConfrontaPassword {
    public boolean confronta(List<String> passwords, String password) {
        for (String s : passwords) {
            if (password.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
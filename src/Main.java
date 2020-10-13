import java.util.List;
import java.util.Scanner;

/**
 *
 */

public class Main {
    private static final String PATH = "res/passwords.txt";

    public static void main(String[] args) {
        //Inserisco la password
        String password = inputPassword();

        //Leggo il file e inserisco ogni riga sulla lista
        ReadTxtFile readTxtFile = new ReadTxtFile();
        List<String> lista = readTxtFile.readFileInList(PATH);

        //Confronto la password e stampo il risultato
        ConfrontaPassword confrontaPassword = new ConfrontaPassword();
        System.out.print(confrontaPassword.confronta(lista, password));
    }

    private static String inputPassword() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la tua password: ");
        return input.next();
    }
}
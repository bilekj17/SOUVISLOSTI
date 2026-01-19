import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Graf graf = new Graf();

        Vrchol podmokly = graf.addV("Podmokly");
        Vrchol plzen = graf.addV("Plzeň");
        Vrchol hradek = graf.addV("Hrádek");
        Vrchol brasy = graf.addV("Břasy");
        Vrchol rokycany = graf.addV("Rokycany");
        Vrchol myto = graf.addV("Mýto");

        graf.addH(podmokly, plzen);
        graf.addH(plzen, hradek);
        graf.addH(hradek, brasy);
        graf.addH(podmokly, brasy);
        graf.addH(rokycany, myto);


    }
}
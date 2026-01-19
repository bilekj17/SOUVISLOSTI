import java.util.ArrayList;
import java.util.List;

public class Graf {
    private List<Vrchol> vrcholy = new ArrayList<>();
    private List<Hrana> hrany = new ArrayList<>();
    private List<Vrchol> souvislosti = new ArrayList<>();

    public Vrchol addV(String nazev) {
        Vrchol v = new Vrchol(nazev);
        vrcholy.add(v);
        return v;
    }

    public void addH(Vrchol a, Vrchol b) {
        if (a != null && b != null) {
            hrany.add(new Hrana(a, b));
        }else{
            System.err.println("error");
        }
    }

    public void souvislost(){
        int i = 0;
        while (souvislosti.get(i) != null){
            for (Hrana hrana : hrany){
                if (hrana.getA().getNazev().equals(souvislosti.get(i).getNazev())){
                    boolean nalezeno = false;
                    for (Vrchol s : souvislosti){
                        if (s.getNazev().equals(hrana.getB().getNazev())){
                            nalezeno = true;
                        }
                    }if (!nalezeno){
                        souvislosti.add(hrana.getB());
                    }
                }
            }
            i++;
        }
    }
}

public class Vrchol {
    private String nazev;
    private boolean jeVGrafu = false;

    public Vrchol(String nazev) {
        this.nazev = nazev;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public boolean isJeVGrafu() {
        return jeVGrafu;
    }

    public void setJeVGrafu(boolean jeVGrafu) {
        this.jeVGrafu = jeVGrafu;
    }
}

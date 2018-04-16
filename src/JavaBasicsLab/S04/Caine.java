package JavaBasicsLab.S04;

public class Caine {
    private String rasa;
    private int varsta;
    private String nume;
    private boolean isVaccinat;

    public Caine(String nume, int varsta) {
        setVarsta(varsta);
        this.nume = nume;
    }

    public Caine() {
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if (varsta < 0) {
            System.out.println("[ERROR] Atentie! Varsta setata este mai mica decat 0");
        }
        this.varsta = Math.abs(varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String numeleCainelui) {
        this.nume = numeleCainelui;
    }

    public boolean isVaccinat() {
        return isVaccinat;
    }

    public void setVaccinat(boolean vaccinat) {
        this.isVaccinat = vaccinat;
    }
}

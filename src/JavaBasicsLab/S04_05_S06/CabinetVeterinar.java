package JavaBasicsLab.S04_05_S06;

public class CabinetVeterinar {
    Caine[] registruCaini;
    String numeDoctor;
    Caine caineleCabinetului;
    private int numarCaini;

    public CabinetVeterinar() {
        this.registruCaini = new Caine[20];
        this.numarCaini = 0;
    }

    public void vaccineaza(Caine c){
        c.setVaccinat(true);
    }

    public void adaugaCaine(Caine c){
            registruCaini[numarCaini] = c;
            numarCaini++;
    }

    public void print() {
        for (int i = 0; i < numarCaini; i++) {
            System.out.println(registruCaini[i].getNume());
        }
    }
}

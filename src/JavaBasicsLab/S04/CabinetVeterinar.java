package JavaBasicsLab.S04;

public class CabinetVeterinar {
    Caine[] registruCaini = new Caine[100];
    private int indexRegistru = 0;
    String numeDoctor;
    Caine caineleCabinetului;

    public void vaccineaza(Caine c){
        c.setVaccinat(true);
    }

    public void adaugaInRegistru(Caine c){
        if (indexRegistru == 100) {
            System.out.println("Registrul este plin. Pentru a putea inscrie un nou Caine, inlocuiti o intrare veche.");
        } else {
            registruCaini[indexRegistru] = c;
            indexRegistru++;
        }
    }
}

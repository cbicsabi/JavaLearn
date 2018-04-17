package JavaBasicsLab.S04_05;

public class MainClassSession4 {
    public static void main(String[] args) {
        Caine c1 = new Caine("Gigel", -4);

        c1.setRasa("Beremanez");
        c1.setVaccinat(true);

        System.out.println(c1.getNume());
        System.out.println(c1.getRasa());
        System.out.println(c1.getVarsta());
        System.out.println(c1.isVaccinat());

        Caine c2 = new Caine("Azor", -6);
        System.out.println(c2.getVarsta());

        c2.setVarsta(2);
        System.out.println(c2.getVarsta());

        CabinetVeterinar doggyVet = new CabinetVeterinar();

        System.out.println("Stadiul vaccinarii cainelui: " + c2.isVaccinat());
        doggyVet.vaccineaza(c2);
        System.out.println("Stadiul vaccinarii cainelui: " + c2.isVaccinat());

        doggyVet.adaugaCaine(c1);
        doggyVet.adaugaCaine(c2);

        doggyVet.print();

        System.out.println(c1);
        System.out.println(doggyVet.registruCaini[0]);
        System.out.println(doggyVet.registruCaini[3]);

        int in = 3;

        System.out.println("-------");

        Caine c3 = c2;
        System.out.println(c2.getNume());
        System.out.println(c3.getNume());
        c3.setNume("Grasu");
        System.out.println(c2.getNume());
        System.out.println(c3.getNume());
        c2.setNume("Slabul");
        System.out.println(c2.getNume());
        System.out.println(c3.getNume());

        System.out.println("=======");

        c3.setNume(c1.getNume());
        System.out.println(c3.getNume());
        c1.setNume("Marius");
        System.out.println(c1.getNume());
        System.out.println(c3.getNume());

    }
}

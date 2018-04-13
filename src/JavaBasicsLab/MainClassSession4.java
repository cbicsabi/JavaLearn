package JavaBasicsLab;

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

        doggyVet.registruCaini[0] = c1;
        doggyVet.registruCaini[1] = c2;

        for(Caine c : doggyVet.registruCaini){
            System.out.println(c.getNume());
        }
    }
}

import pl.Kandydat;
import pl.Rekrutacja;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Kandydat> group = new ArrayList<Kandydat>();
        Kandydat kandydat1 = new Kandydat("Patryk", 22, "wyższe", 4);
        Kandydat kandydat2 = new Kandydat("Adam", 32, "średnie", 11);
        Kandydat kandydat3 = new Kandydat("Jacek", 18, "średnie", 8);
        Kandydat kandydat4 = new Kandydat("Rafał", 48, "średnie", 9);
        Kandydat kandydat5 = new Kandydat("Angelika", 39, "wyższe", 39);
        Kandydat kandydat6 = new Kandydat("Ola", 39, "wyższe", 15);

        group.add(kandydat1);
        group.add(kandydat2);
        group.add(kandydat3);
        group.add(kandydat4);
        group.add(kandydat5);
        group.add(kandydat6);
        group.sort(Kandydat::compareTo);

        for(int i = 0; i <=group.size()-1; i++){
            System.out.println(group.get(i).getnazwa());
        }
        System.out.println(Qualified(kandydat1));
    }
    public static boolean Qualified(Kandydat k){
        Rekrutacja.set();
        if (k.getlatadoswiadczenia() >= Rekrutacja.set())
            return true;

        return false;
    }
}
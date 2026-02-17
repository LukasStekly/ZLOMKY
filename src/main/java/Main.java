import cz.uhk.zlomky.data.Zlomek;

public class Main {

    public static void main() {
        IO.println("==========Projekt zlomky==========");  // v java 25 jde takhle napsat nově
        IO.println("__________________________________");

        Zlomek a = new Zlomek(); //konstruktor bez parametru nebo defaultni
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b = new Zlomek(3, 4);

        IO.println(a);
        IO.println(b);


        var soucet = a.plus(b);
        IO.println("Soucet je %s".formatted(a.plus(b).zkratit()));

        IO.println("Rozdil je %s".formatted(a.minus(b).zkratit()));

        IO.println("Soucin je %s".formatted(a.nasobeni(b).zkratit()));

        IO.println("Podil je %s".formatted(a.deleni(b).zkratit()));

        Zlomek[] pole = new Zlomek[]
                {
                        new Zlomek (1,3),
                        new Zlomek (1,2),
                        new Zlomek (6,5),
                        new Zlomek (4,3),
                        new Zlomek (7,8),
                        new Zlomek (13,10),

                };

        Zlomek vysl = prumer(pole);
        IO.println("Aritmetický průměr je %s".formatted(vysl));


    }

    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek();
        for (var z :pole)
        {
            soucet = soucet.plus(z);
        }
        var pocet = new Zlomek(pole.length, 1);

        return soucet.deleni(pole.length);
    }

}

import cz.uhk.zlomky.data.Zlomek;

public class Main {

    public static void main() {
        IO.println("==========Projekt zlomky==========");  // v java 25 jde takhle napsat nově
        IO.println("__________________________________");

        Zlomek a = new Zlomek(); //konstruktor bez parametru nebo defaultni
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b = new Zlomek(3,4);

        IO.println(a);
        IO.println(b);

    }

}

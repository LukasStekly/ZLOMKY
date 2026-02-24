package cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.data.Zlomek;

public class MereniApp {
public static void main(String[] args){
    var mereni =new Mereni();

    mereni.pridejMereni(new Zlomek(1,2));
    mereni.pridejMereni(new Zlomek(3,5));
    mereni.pridejMereni(new Zlomek(7,4));
    mereni.pridejMereni(new Zlomek(6,9));
    mereni.pridejMereni(new Zlomek(15,4));

    mereni.pridejMereni(11);
    mereni.pridejMereni(10.8);
    mereni.pridejMereni(92.45);
    mereni.pridejMereni(13E5);
    mereni.pridejMereni(11.4f);

    for (int i = 0; i < mereni.pocet();i++){
        IO.println(mereni.get(i));
    }

    IO.println("Součet je %s".formatted(mereni.soucet()));
    IO.println("Průměř je %s".formatted(mereni.prumer()));
    Number max = mereni.max();
    if (max instanceof Double || max instanceof Float)
        IO.println("Maximum je %f".formatted(max));
    else
        IO.println("Maximum je %s".formatted(max));
    //IO.println("maximum je %s".formatted(max.doubleValue()));

    Number min = mereni.min();
    if (min instanceof Double || min instanceof Float)
        IO.println("Minimum je %f".formatted(min));
    else
        IO.println("Minimum je %s".formatted(min));
    //IO.println("Minimum je %s".formatted(mereni.min().doubleValue()));
}
}


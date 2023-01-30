package org.example;

public class Main {
    public static void main(String[] args) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
        TomadaDeDoisPinos t2 = new TomadaDeDoisPinos();

        AdapterTomada a = new AdapterTomada(t3);
        a.ligarNaTomadaDeDoisPinos();

        t2.ligarNaTomadaDeDoisPinos();


    }
}
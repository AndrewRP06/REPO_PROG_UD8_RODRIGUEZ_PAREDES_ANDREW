package a01;
public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        Televisor televisor = new Televisor();

        bombilla.encender();
        bombilla.conectarWifi(DispositivoConectado.Wifi);
        bombilla.mostrarInfoGeneral();
        bombilla.apagar();

        System.out.println();

        televisor.encender();
        televisor.conectarWifi(DispositivoConectado.Wifi);
        televisor.mostrarInfoGeneral();
        televisor.apagar();
    }
}

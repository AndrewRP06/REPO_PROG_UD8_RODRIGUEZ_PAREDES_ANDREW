package a01;
public class Televisor implements DispositivoConectado{
    private  boolean encendido = false;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido.");
    }
    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado.");
    }

    @Override
    public void conectarWifi(String Wifi) {
        System.out.println("Televisor conectado a: " + Wifi);
    }


}

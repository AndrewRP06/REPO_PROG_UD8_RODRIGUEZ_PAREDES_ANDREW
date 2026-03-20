package a01;

public class Bombilla implements DispositivoConectado {
    private boolean encendida = false;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Bombilla encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Bombilla apagada.");
    }

    @Override
    public void conectarWifi(String Wifi) {
        System.out.println("Bombilla conectada a: " + Wifi);
    }
    
}
package a01;
public interface  DispositivoConectado {
    final static String Wifi = "Wifi7"; 

    void encender();
    void apagar();
    void conectarWifi(String Wifi);


    default void mostrarInfoGeneral() {
        System.out.println("Conectado a: " + Wifi);
    }

}

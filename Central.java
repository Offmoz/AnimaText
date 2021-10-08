import java.io.IOException;

public class Central {

        public static int animaRun = 0,reproducirPaina = 0;
        public static boolean bucleDetecciones = true;



    public static void main(String[] args) throws Exception {

        //Creacion de hilos
        Thread ventanaPrograma = new Thread( new Ventana_Crear_Modificar(),"ventana");
        Thread ventanaCarga = new Thread (new IconoAnimaTextCargando(),"ventanaCargando");
        //LLama
        for(int i = 0; i < 1;i++){
            ventanaCarga.run();
            Utilidades.realentizar(2000);
            IconoAnimaTextCargando.eliminarVentana();
        }

        ventanaPrograma.run();

        animaText();

        buclesDetecciones();

    }

    public static void animaText(){
        Paneles_Creacion menuInicial = new Paneles_Creacion();
        Paneles_Creacion.borrarRedaccion();
        menuInicial.panelMenuIni();
    }

    public static void animaTextRun(){
        Paneles_Creacion animaTextRun = new Paneles_Creacion();
        Paneles_Creacion.borrarMenuIni();
        animaTextRun.panelRedaccion();
    }

    public static void buclesDetecciones(){

        while(bucleDetecciones){

            if(reproducirPaina == 0){
                Utilidades.realentizar(150);
                System.out.println("En Bucle");
            }
            else{
                try {
                    AnimaText.animaText();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }

}

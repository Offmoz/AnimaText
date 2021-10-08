import java.io.FileNotFoundException;
import java.io.IOException;

public class AnimaText {
    static int parrafo = 0, tiempoRealentizar = 90,pause = 0;

    static void animaText() throws FileNotFoundException, IOException{

        char caracterParrafo;
            for(; parrafo < Creacion_Texto.parrafoTXT.length;parrafo++){
                for(int caracter = 0; caracter < Creacion_Texto.parrafoTXT[parrafo].length(); caracter++){
                        if(pause == 1){
                            while(true){
                                pause++;
                                pause--;
                                System.out.println("pausa activa");
                                Utilidades.realentizar(150);
                            }
                        }
                    caracterParrafo = Creacion_Texto.parrafoTXT[parrafo].charAt(caracter);

                    Creacion_Texto.parrafoVisible = Creacion_Texto.parrafoVisible + caracterParrafo;
                    Creacion_Texto.parrafos[parrafo].setText(Creacion_Texto.parrafoVisible);
                    Paneles_Creacion.panelRedaccion.updateUI();
                    Utilidades.realentizar(tiempoRealentizar);

                    if(parrafo == Creacion_Texto.parrafoTXT.length){
                        parrafo = 0;
                    }
                }
                Creacion_Texto.parrafoVisible = "";
            }

    }

}

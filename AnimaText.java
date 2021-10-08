import java.io.FileNotFoundException;
import java.io.IOException;

public class AnimaText {
    static int parrafo = 0, tiempoRealentizar = 90;

    static void animaText() throws FileNotFoundException, IOException{

        char caracterParrafo;
            for(; parrafo < Creacion_Texto.parrafoTXT.length;parrafo++){
                for(int caracter = 0; caracter < Creacion_Texto.parrafoTXT[parrafo].length(); caracter++){
                    /*if(tiempoRealentizar == 1){
                        tiempoRealentizar = 90;
                    }*/

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

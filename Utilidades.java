import java.awt.*;
import java.io.InputStream;

public class Utilidades {
    private static Font font = null;
    public String fuenteCharlemange = "Bukhari Script.ttf";

    Font fuente(String fontName, int estilo, float tama){

        try{
            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT,is);

        }catch (Exception ex){
            System.err.println(fontName + "Namames codifica bien >:v");
            font = new Font("Arial",Font.PLAIN,50);
        }

        Font tfont = font.deriveFont(estilo,tama);
        return tfont;

    }




    public static void realentizar (int tiempo){
        try{Thread.sleep(tiempo);}catch(InterruptedException e){}
    }




    public static Color RGB(int r, int g, int b){
        Color RGB = new Color(r,g,b);
        return RGB;
    }

}

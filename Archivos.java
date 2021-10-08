import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Archivos{
    static String rutaPaginas = ("src\\Assets\\Historias");
    static String[] listaPaginas;
    static int pagina = 0;

    public static void listaPaginas(){
        File carpeta = new File(rutaPaginas);
        listaPaginas = carpeta.list();
    }

    public static String[] texto = new String [21];
    public static String leerParrafoTxT(int lineaParrafo) throws IOException,FileNotFoundException{
        String linea = Files.readAllLines(Paths.get("src\\Assets\\Historias\\"+listaPaginas[pagina])).get(lineaParrafo);

        String textoReturn = "";

            try{
                for(int n = 0; n< linea.length();n++){
                        char filtro = linea.charAt(n);
                        if(filtro == '-'){
                            texto[lineaParrafo] = textoReturn;
                            return texto[lineaParrafo];
                        }

                        textoReturn = textoReturn + filtro;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{}
            return texto[lineaParrafo];
    }
}

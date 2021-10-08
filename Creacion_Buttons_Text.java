import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.*;

public class Creacion_Buttons_Text {
            private static final int HAND_CURSOR2 = Cursor.HAND_CURSOR;

            static JButton
            botonIniciar,botonSalir,botonSalirRedaccion,
            botonOpciones,botonMover,botonVolverMenu;
            static  JButton
            botonPause,botonPlay,botonRetro,botonAvance;


            eventos eventoBotones = new eventos();

    public void colocarBotonesMenuInicial(){

        botonSalir = new JButton();
        ImageIcon BTNsalir_1 = new ImageIcon("Assets/Imagenes/Botones/BTNsalir_1.png");
        ImageIcon BTNsalir_2 = new ImageIcon("Assets/Imagenes/Botones/BTNsalir_2.png");
        botonSalir.setCursor(new Cursor(HAND_CURSOR2));
        botonSalir.setContentAreaFilled(false);
        botonSalir.setBounds(775,0,25,25);
        botonSalir.setIcon(new ImageIcon(BTNsalir_1.getImage().getScaledInstance(botonSalir.getWidth() ,botonSalir.getHeight(), Image.SCALE_SMOOTH)));
        botonSalir.setPressedIcon(new ImageIcon(BTNsalir_2.getImage().getScaledInstance(botonSalir.getWidth(),botonSalir.getHeight(), Image.SCALE_SMOOTH)));
        botonSalir.setBorder(null);
        botonSalir.setFocusable(false);

        botonSalir.addActionListener(eventoBotones);


      //-------------------------------------------------------------------------------------------------------------------------------------------------------------
        ImageIcon BTNmenu_1 = new ImageIcon("Assets/Imagenes/Botones/BTNmenu_1.png");
        ImageIcon BTNmenu_2 = new ImageIcon("Assets/Imagenes/Botones/BTNmenu_2.png");
        botonIniciar = new JButton();
        Fuente tipoFuente = new Fuente();
        botonIniciar.setCursor(new Cursor(HAND_CURSOR2));
        botonIniciar.setText("Iniciar");
        botonIniciar.setFont(tipoFuente.fuente(tipoFuente.fuenteCharlemange,0,30));
        botonIniciar.setBounds(275,190,250,60);
        botonIniciar.setIcon(new ImageIcon(BTNmenu_1.getImage().getScaledInstance(botonIniciar.getWidth() ,botonIniciar.getHeight(), Image.SCALE_SMOOTH)));
        botonIniciar.setPressedIcon(new ImageIcon(BTNmenu_2.getImage().getScaledInstance(botonIniciar.getWidth() ,botonIniciar.getHeight(), Image.SCALE_SMOOTH)));
        botonIniciar.setContentAreaFilled(false);
        botonIniciar.setHorizontalTextPosition(SwingConstants.CENTER);
        botonIniciar.setVerticalTextPosition(SwingConstants.CENTER);
        botonIniciar.setBorder(null);
        botonIniciar.setFocusable(false);
        botonIniciar.setForeground(Utilidades.RGB(255,255,255));

        botonIniciar.addActionListener(eventoBotones);

      //-------------------------------------------------------------------------------------------------------------------------------------------------------------


    Paneles_Creacion.panelMenuInicial.add(botonSalir);
    Paneles_Creacion.panelMenuInicial.add(botonIniciar);
    }

    public void colocarBotonesRedaccion(){

        botonPlay = botonPlatilla.botonPlantilla(25, "PL");
        botonPlay.addActionListener(eventoBotones);

        botonPause = botonPlatilla.botonPlantilla(50, "PA");
        botonPause.addActionListener(eventoBotones);

        botonRetro = botonPlatilla.botonPlantilla(0, "<");
        botonRetro.addActionListener(eventoBotones);

        botonAvance = botonPlatilla.botonPlantilla(75, ">");
        botonAvance.addActionListener(eventoBotones);

        botonSalirRedaccion = new JButton();
        botonSalirRedaccion.setCursor(new Cursor(HAND_CURSOR2));
        botonSalirRedaccion.setBounds(775,0,25,23);
        botonSalirRedaccion.setBackground(Utilidades.RGB(0,0,0));
        botonSalirRedaccion.setText("X");
        botonSalirRedaccion.setBorder(null);
        botonSalirRedaccion.setFocusable(false);
        botonSalirRedaccion.setForeground(Color.WHITE);

        botonSalirRedaccion.addActionListener(eventoBotones);

        ImageIcon BTNmenu_1 = new ImageIcon("Assets/Imagenes/Botones/BTNVolverMenu_1.png");
        ImageIcon BTNmenu_2 = new ImageIcon("Assets/Imagenes/Botones/BTNVolverMenu_2.png");
        botonVolverMenu = new JButton();
        botonVolverMenu.setContentAreaFilled(false);
        botonVolverMenu.setCursor(new Cursor(HAND_CURSOR2));
        botonVolverMenu.setBounds(0,0,25,25);
        botonVolverMenu.setIcon(new ImageIcon(BTNmenu_1.getImage().getScaledInstance(botonVolverMenu.getWidth() ,botonVolverMenu.getHeight(), Image.SCALE_SMOOTH)));
        botonVolverMenu.setPressedIcon(new ImageIcon(BTNmenu_2.getImage().getScaledInstance(botonVolverMenu.getWidth() ,botonVolverMenu.getHeight(), Image.SCALE_SMOOTH)));
        botonVolverMenu.setBorder(null);
        botonVolverMenu.setFocusable(false);

        botonVolverMenu.addActionListener(eventoBotones);

        Paneles_Creacion.panelRedaccion.add(botonSalirRedaccion);
        Paneles_Creacion.panelRedaccion.add(botonVolverMenu);
        Paneles_Creacion.panelRedaccion.add(botonPlay);
        Paneles_Creacion.panelRedaccion.add(botonRetro);
        Paneles_Creacion.panelRedaccion.add(botonAvance);
        Paneles_Creacion.panelRedaccion.add(botonPause);

    }

}

class Creacion_Texto{
    static Fuente tipoFuente;
    static String parrafoVisible = "";
    static int posicionParrafo = 26;
    static String[] parrafoTXT = new String [20];
    static JTextField[] parrafos = new JTextField[20];

    void cajasDeTexto(){
        for(int i = 0; i < 20; i++){
            parrafos[i] = new JTextField(" ");
            parrafos[i].setBounds(20,posicionParrafo,770,20);
            tipoFuente = new Fuente();
            parrafos[i].setFont(tipoFuente.fuente(tipoFuente.fuenteCharlemange,0,15));
            parrafos[i].setEditable(false);
            parrafos[i].setForeground(Color.white);
            parrafos[i].setBorder(null);
            parrafos[i].setOpaque(false);

            Paneles_Creacion.panelRedaccion.add(parrafos[i]);
            posicionParrafo = posicionParrafo + 26;
            Paneles_Creacion.panelRedaccion.updateUI();
        }
    }

    static void rellenarParrafos() throws FileNotFoundException, IOException{
        for(int parrafo = 0; parrafo < parrafoTXT.length;parrafo++){
            parrafoTXT[parrafo] = Archivos.leerParrafoTxT(parrafo);
            System.out.println(parrafoTXT[parrafo]);
        }
    }

    static void vaciarParrafos(int realentizarTiempo){
        for(int i = 0;i < parrafos.length;i++){
            AnimaText.parrafo = 0;
            parrafoTXT[i] = " ";
            if(realentizarTiempo == 1){AnimaText.tiempoRealentizar = 1;}
            else{AnimaText.tiempoRealentizar = 90;}
            parrafos[i].setText(" ");
            Archivos.texto[i] = " ";

        }
    }

}


class botonPlatilla{
    static JButton plantilla;
    private static final int HAND_CURSOR2 = Cursor.HAND_CURSOR;

    static JButton botonPlantilla(int x,String nombre){
        plantilla = new JButton();
        plantilla.setBounds(x,561,20,30);
        plantilla.setCursor(new Cursor(HAND_CURSOR2));
        plantilla.setText(nombre);
        plantilla.setOpaque(false);
        plantilla.setContentAreaFilled(false);
        plantilla.setForeground(Utilidades.RGB(255, 255, 255));
        plantilla.setFocusable(false);
        plantilla.setBorder(null);
        return plantilla;
    }

}


class eventos implements ActionListener{

    private boolean crearMenuIni = true;
    Creacion_Texto linkCreacionTextos = new Creacion_Texto();

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==Creacion_Buttons_Text.botonIniciar){
            Archivos.listaPaginas();
            if(crearMenuIni == true){
                Central.animaTextRun();
                crearMenuIni = false;
            }
            else{Paneles_Creacion.borrarMenuIni();}
        }

        if(evento.getSource() == Creacion_Buttons_Text.botonPlay){
            Creacion_Texto.vaciarParrafos(0);
            try {
                Creacion_Texto.rellenarParrafos(); Central.reproducirPaina = 1;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(evento.getSource() == Creacion_Buttons_Text.botonAvance){
            Creacion_Texto.vaciarParrafos(1);
            Archivos.pagina++;
            if(Archivos.pagina > Archivos.listaPaginas.length - 1){
                Archivos.pagina = Archivos.listaPaginas.length - 1 ;
            }
            System.out.println(Archivos.pagina);
        }

        if(evento.getSource() == Creacion_Buttons_Text.botonRetro){
            Creacion_Texto.vaciarParrafos(1);
            Archivos.pagina--;
            if(Archivos.pagina < 0){
                Archivos.pagina = 0;
            }
            System.out.println(Archivos.pagina);
        }

        if(evento.getSource() == Creacion_Buttons_Text.botonVolverMenu){
            Paneles_Creacion.borrarRedaccion();
            System.out.println("Panel Borrado creado");
        }

        if(evento.getSource()==Creacion_Buttons_Text.botonSalir||evento.getSource()==Creacion_Buttons_Text.botonSalirRedaccion){
            System.exit(0);
        }

    }

}

class Fuente{
    private Font font = null;
    public String fuenteCharlemange = "Bukhari Script.ttf";

    public Font fuente(String fontName, int estilo, float tama){

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

}

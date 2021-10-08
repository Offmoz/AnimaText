import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class Paneles_Creacion implements ActionListener{

    public static int pantallaX,pantallaY,mouseX,mouseY;

        static JPanel panelMenuInicial = new JPanel();
        static JPanel panelRedaccion = new JPanel();
        static JPanel panelBotonesReproduccion = new JPanel();
        static JLabel labelPagina = new JLabel();
        Creacion_Buttons_Text linkCreacionBotones = new Creacion_Buttons_Text();
        Creacion_Texto linkCreacionTextos = new Creacion_Texto();
        boolean instanciarBotones = true;


    public void panelMenuIni(){

        JTextField info = new JTextField();
        info.setText("V Beta 1.0");
        info.setBounds(25,0,60,25);
        info.setForeground(Utilidades.RGB(255,255,255));
        info.setOpaque(false);
        info.setBorder(null);
        info.setEditable(false);

        JPanel panelBarra = new JPanel();
        panelBarra.setBounds(0,0,800,25);
        panelBarra.setBackground(Utilidades.RGB(6,66,86));

        JLabel fondoMenu = new JLabel();
        fondoMenu.setBounds(0,0,800,600);
        ImageIcon fondoMenuImagen = new ImageIcon("Assets/Imagenes/Fondos/Fondo_1.png");
        fondoMenu.setIcon(new ImageIcon(fondoMenuImagen.getImage().getScaledInstance(fondoMenu.getWidth() ,fondoMenu.getHeight(), Image.SCALE_SMOOTH)));

        JLabel barraMovimiento = new JLabel();
        barraMovimiento.setBounds(0,0,750,25);
        barraMovimiento.setOpaque(false);
        barraMovimiento.setBorder(null);
        barraMovimiento.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                panelMovimientoMouseClicked(evt);
            }
        });
        barraMovimiento.addMouseMotionListener(new java.awt.event.MouseAdapter(){
            public void mouseDragged(java.awt.event.MouseEvent evt){
                panelMovimientoMouseDragged(evt);
            }
        });

        JLabel icono = new JLabel();
        icono.setBounds(0,2,20,20);
        icono.setOpaque(false);
        icono.setBorder(null);
        ImageIcon iconoRu = new ImageIcon("Assets/Imagenes/Iconos/AnimaText.png");
        icono.setIcon(new ImageIcon(iconoRu.getImage().getScaledInstance(icono.getWidth() ,icono.getHeight(), Image.SCALE_SMOOTH)));

        //panel del fondo del menu iniciar, con botones etc...
        panelMenuInicial.setLayout(null);
        linkCreacionBotones.colocarBotonesMenuInicial();
        panelMenuInicial.add(panelBarra);
        barraMovimiento.add(icono);
        barraMovimiento.add(info);
        panelMenuInicial.add(fondoMenu);
        Ventana_Crear_Modificar.colocarBarraMovimiento();

        Ventana_Crear_Modificar.ventanaP.add(panelMenuInicial);
        panelMenuInicial.updateUI();
    }

    public void panelRedaccion(){

        panelRedaccion.setBounds(0,0,800,600);
        panelRedaccion.setBackground(Utilidades.RGB(0,0,0));
        panelRedaccion.setLayout(null);
        panelBotonesReproduccion.setBounds(0,550,100,50);
        panelBotonesReproduccion.setBackground(Utilidades.RGB(3,3,3));
        panelBotonesReproduccion.setLayout(null);
        linkCreacionTextos.cajasDeTexto();
        linkCreacionBotones.colocarBotonesRedaccion();
        panelRedaccion.add(panelBotonesReproduccion);
        panelRedaccion.add(labelsRedaccion());

        Ventana_Crear_Modificar.ventanaP.add(panelRedaccion);
        panelRedaccion.updateUI();
    }

    public static void repintarNumeroPagina(){
        labelPagina.setText("Pagina: "+Archivos.pagina);
    }

    private JLabel labelsRedaccion(){
        labelPagina.setBounds(730,580,100,20);
        labelPagina.setForeground(Color.white);
        labelPagina.setBorder(null);
        labelPagina.setOpaque(false);
        labelPagina.setText("Pagina: "+Archivos.pagina);
        return labelPagina;

    }

    private void panelMovimientoMouseClicked(java.awt.event.MouseEvent evt){
        mouseX = evt.getX();
        mouseY = evt.getY();
    }

    private void panelMovimientoMouseDragged(java.awt.event.MouseEvent evt){
        Ventana_Crear_Modificar.ventanaP.setLocation(Ventana_Crear_Modificar.ventanaP.getLocation().x + evt.getX() - mouseX - 400, Ventana_Crear_Modificar.ventanaP.getLocation().y + evt.getY() - mouseY - 13);
        pantallaX = Ventana_Crear_Modificar.ventanaP.getX(); pantallaY = Ventana_Crear_Modificar.ventanaP.getY();
    }

    public static void borrarMenuIni(){
        Ventana_Crear_Modificar.ventanaP.remove(panelMenuInicial);
        Ventana_Crear_Modificar.ventanaP.add(panelRedaccion);
        panelRedaccion.updateUI();
    }

    public static void borrarRedaccion(){
        Ventana_Crear_Modificar.ventanaP.remove(panelRedaccion);
        Ventana_Crear_Modificar.ventanaP.add(panelMenuInicial);
        panelMenuInicial.updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}

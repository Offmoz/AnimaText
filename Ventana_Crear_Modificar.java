import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Crear_Modificar extends JFrame implements Runnable, ActionListener {
    Thread t;
    public static JFrame ventanaP = new JFrame();

    public static int pantallaX,pantallaY,mouseX,mouseY;

    public void run(){
        crearVentana();
    }

    private void crearVentana(){

        ventanaP.setSize(800,600);
        ventanaP.setTitle("AnimaText.");
        ventanaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaP.setLocationRelativeTo(null);
        ventanaP.setUndecorated(true);
        ventanaP.setResizable(false);
        ventanaP.setBackground(Color.BLACK);

        ventanaP.setVisible(true);

    }

    public static void colocarBarraMovimiento(){
        JLabel barraMovimiento = new JLabel();
        barraMovimiento.setBounds(50,0,700,25);
        barraMovimiento.setOpaque(false);
        barraMovimiento.setBorder(null);
        barraMovimiento.setLayout(null);
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
        ventanaP.add(barraMovimiento);
    }

        private static void panelMovimientoMouseClicked(java.awt.event.MouseEvent evt){
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
        private static void panelMovimientoMouseDragged(java.awt.event.MouseEvent evt){
            ventanaP.setLocation(ventanaP.getLocation().x + evt.getX() - mouseX - 400, Ventana_Crear_Modificar.ventanaP.getLocation().y + evt.getY() - mouseY - 13);
            pantallaX = ventanaP.getX(); pantallaY = ventanaP.getY();
        }

}

class IconoAnimaTextCargando extends JFrame implements Runnable{

    static JFrame ventanaCarga = new JFrame();
    JPanel fondoPantalla = new JPanel();

    @Override
    public void run() {
        valorDeVentana();
        colocarIcono();
    }

    int XV = 299, YV = 270;

    void valorDeVentana(){
        ventanaCarga.setMinimumSize(new Dimension(XV,YV));
        ventanaCarga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaCarga.setLocationRelativeTo(null);
        ventanaCarga.setUndecorated(true);
        ventanaCarga.setResizable(false);
    }

    //640 640
    void colocarIcono(){

        fondoPantalla.setOpaque(false);
        fondoPantalla.setBounds(0,0,XV,YV);

        JLabel iconoANIMA = new JLabel();
        iconoANIMA.setBounds(0,0,XV,YV);
        iconoANIMA.setIcon(new javax.swing.ImageIcon( getClass().getResource( "vidLogo.gif" ) ) );

        fondoPantalla.setLayout(null);
        fondoPantalla.add(iconoANIMA);
        ventanaCarga.add(fondoPantalla);
        ventanaCarga.setVisible(true);
        fondoPantalla.updateUI();
        return;

    }

    public static void eliminarVentana(){
        ventanaCarga.setVisible(false);
    }

}
